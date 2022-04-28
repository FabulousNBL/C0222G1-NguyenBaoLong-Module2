package case_study.casestudy.service.implement;



import case_study.casestudy.models.Booking;
import case_study.casestudy.models.Contract;
import case_study.casestudy.models.person.Customer;
import case_study.casestudy.service.ContractService;

import java.io.IOException;
import java.util.*;

public class ContractServiceImpl implements ContractService {
    static List<Contract>contractList= new ArrayList<>();
    static Scanner input= new Scanner(System.in);
    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("Đang tạo hợp đồng cho booking có thông tin : " + booking.toString());
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin: " + customer.toString());
            System.out.println("Nhập id hợp đồng");
            String idContract = input.nextLine();
            System.out.println("Nhập số tiền trả trước :");
            String prePay = input.nextLine();
            System.out.println("Nhập tổng chi phí:");
            String totalPay = input.nextLine();
            Contract contract = new Contract(customer, idContract, prePay, totalPay, booking);
            contractList.add(contract);
            System.out.println("Đã tạo hợp đồng :" + contract.toString());
        }
    }
    @Override
    public void displayListContract() {

        for (Contract contract:contractList) {
            System.out.println(contract.toString());
        }
    }
    @Override
    public void editContract() {
        CustomerServiceImpl customerService= new CustomerServiceImpl();

        boolean flag= true;
        boolean check= false;
        int index =0;
        while (flag){
            System.out.println("Nhập id hợp đồng muốn sửa: ");
            String newID= input.nextLine();
            for (int i = 0; i <contractList.size() ; i++) {
                if (contractList.get(i).getIdContract().contains(newID)){
                    check=true;
                    index=i;
                    break;
                }
            }
            if (check){
                flag= false;
                System.out.println("Nhập mới số tiền trả trước ");
                String newDeposit= input.nextLine();
                contractList.get(index).setDeposit(newDeposit);
                System.out.println("Nhập mới tổng chi phí");
                String newTotal= input.nextLine();
                contractList.get(index).setTotalFee(newTotal);
            }else {
                System.out.println("Không có hợp đồng này !!");
                flag= false;
            }
        }
    }

}
