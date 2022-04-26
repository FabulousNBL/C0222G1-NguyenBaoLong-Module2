package casestudy.service.implement;

import casestudy.models.Booking;
import casestudy.models.facility.Facility;
import casestudy.models.person.Customer;
import casestudy.service.BookingService;
import casestudy.util.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner sc= new Scanner(System.in);

    static Set<Booking> bookingSet= new TreeSet<>(new BookingComparator());
    public Set<Booking>sendBooking(){
        return bookingSet;
    }

    @Override
    public void addNew() {
        int id =1;

        if (!bookingSet.isEmpty()){
            id=bookingSet.size();
        }
        Customer customer= chooseCustomer();
        Facility facility= chooseFacility();

        System.out.println("Nhập ngày bắt đầu thuê");
        String startDate= sc.nextLine();
        System.out.println("Nhập ngày trả phòng");
        String endDate= sc.nextLine();
        Booking booking= new Booking(id,customer,facility,startDate,endDate);
        bookingSet.add(booking);
        System.out.println("Đã booking thành công");
    }

    @Override
    public void displayListBooking() {

        for (Booking booking: bookingSet) {
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer(){
        List<Customer> customers = CustomerServiceImpl.getCustomerList();
        System.out.println("Danh sách khách hàng");
        for (Customer customer:customers) {
            System.out.println(customer.toString());
        }
        System.out.println( "Nhập id khách hàng");
        String id = sc.nextLine();
        boolean check =  true;


        while (check){
            for (Customer customer: customers) {
                if (customer.getIdCustomer().contains(id)){
                    return  customer;
                }else {
                    System.out.println("Không có khách hàng này !!");
                }
            }
            check=false;

        }
        return null;
    }


    public static Facility chooseFacility(){
        Map<Facility, Integer> list = FacilityServiceImpl.getFacilityIntegerMap();
        System.out.println("Danh sách dịch vụ");
        for (Map.Entry<Facility,Integer> entry: list.entrySet()){
            System.out.println(entry.getKey().toString());
        }


        System.out.println( "Nhập id dịch vụ");
        boolean check =  true;
        String id= sc.nextLine();

        while (check){
            for (Map.Entry<Facility,Integer> map: list.entrySet()) {
                if (map.getKey().getId().equals(id)){
                    map.setValue(map.getValue() + 1);
                    return map.getKey();
                }
                check=false;
            }
        }
        return null;
    }


}

