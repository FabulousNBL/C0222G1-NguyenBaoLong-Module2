package case_study.casestudy.service.implement;

import case_study.casestudy.implement.CustomerServiceImp;
import case_study.casestudy.models.Booking;
import case_study.casestudy.models.facility.Facility;
import case_study.casestudy.models.person.Customer;
import case_study.casestudy.service.BookingService;
import case_study.casestudy.util.BookingComparator;
import case_study.casestudy.util.ReadAndWrite;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner sc = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    public static final String FILE_NAME="src\\case_study\\casestudy\\data\\booking\\booking.csv";
    public Set<Booking> sendBooking() {
        return bookingSet;
    }
    public static Set<String>stringSet= new LinkedHashSet<>();

    @Override
    public void addNew() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhập ngày bắt đầu thuê");
        String startDate = sc.nextLine();
        System.out.println("Nhập ngày trả phòng");
        String endDate = sc.nextLine();
        Booking booking = new Booking(id, customer, facility, startDate, endDate);
        bookingSet.add(booking);
        String line= customer+","+facility+","+startDate+","+endDate;
        ReadAndWrite.writeFile(FILE_NAME,line);
        System.out.println("Đã booking thành công");
    }

    @Override
    public void displayListBooking() {

        stringSet= ReadAndWrite.readSet(FILE_NAME);

        for (Booking strings : bookingSet) {
            System.out.println(strings);
        }
    }

    public static Customer chooseCustomer() {
        CustomerServiceImpl customerService= new CustomerServiceImpl();
        customerService.display();
        System.out.println("Danh sách khách hàng");
        List<Customer> customers = CustomerServiceImpl.getCustomer();

        while (true) {
            System.out.println("Nhập id khách hàng");
            String id = sc.nextLine();
            boolean check= true;
            for (Customer customer : customers) {
                if (customer.getIdCustomer().contains(id)) {
                    return customer;
                } else {
                   check= false;
                }
            }
            if (!check){
                System.out.println("Không có khách hàng này!!");
            }

        }

    }

    public static Facility chooseFacility() {
        FacilityServiceImpl facilityService= new FacilityServiceImpl();
        facilityService.display();
        Map<Facility, Integer> list = FacilityServiceImpl.getFacilityIntegerMap();
//        System.out.println("Danh sách dịch vụ");
//        for (Map.Entry<Facility, Integer> entry : list.entrySet()) {
//            System.out.println(entry.getKey().toString());
//        }
        System.out.println("Nhập id dịch vụ");
        boolean check = true;
        String id = sc.nextLine();

        while (check) {
            for (Map.Entry<Facility, Integer> map : list.entrySet()) {
                if (map.getKey().getId().equals(id)) {
                    map.setValue(map.getValue() + 1);
                    return map.getKey();
                }
                check = false;
            }
        }
        return null;
    }
}

