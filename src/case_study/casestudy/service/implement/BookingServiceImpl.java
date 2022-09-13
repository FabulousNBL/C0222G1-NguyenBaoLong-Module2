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


    @Override
    public void addNew() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        String customer = chooseCustomer();
        String facility = chooseFacility();
        System.out.println("Nhập ngày bắt đầu thuê");
        String startDate = sc.nextLine();
        System.out.println("Nhập ngày trả phòng");
        String endDate = sc.nextLine();
        System.out.println("Nhập kiểu dịch vụ");
        String typeService= sc.nextLine();

        String line= id+","+customer+","+facility+","+typeService+","+startDate+","+endDate;
        ReadAndWrite.writeFile(FILE_NAME,line);
        System.out.println("Đã booking thành công");
    }

    @Override
    public void displayListBooking() {

        List<String[]> list= ReadAndWrite.readFile(FILE_NAME);
        for (String[] item :list) {
            bookingSet.add(new Booking(Integer.parseInt(item[0]),item[1],item[2],item[3],item[4],item[5]));
        }
        for (Booking strings : bookingSet) {
            System.out.println(strings);
        }
    }

    public static String chooseCustomer() {
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
                    return id;
                } else {
                   check= false;
                }
            }
            if (!check){
                System.out.println("Không có khách hàng này!!");
            }

        }

    }

    public static String chooseFacility() {
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
                    return id;
                }
                check = false;
            }
        }
        return null;
    }
}

