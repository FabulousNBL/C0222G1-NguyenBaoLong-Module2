package case_study.casestudy.service.implement;



import case_study.casestudy.models.Booking;
import case_study.casestudy.models.Contract;
import case_study.casestudy.models.person.Customer;
import case_study.casestudy.service.ContractService;
import case_study.casestudy.util.ReadAndWrite;

import javax.print.DocFlavor;
import java.io.IOException;
import java.util.*;

public class ContractServiceImpl implements ContractService {
    static List<Contract>contractList= new ArrayList<>();
    static List<String[]> customers= new ArrayList<>();
    static String FILE_CUSTOMER= "src\\case_study\\casestudy\\data\\customer\\customer.csv";
    static Scanner input= new Scanner(System.in);
    static String FILE_NAME="src\\case_study\\casestudy\\data\\contract\\contract.csv";
    @Override
    public void createNewContract() {
        customers= ReadAndWrite.readFile(FILE_CUSTOMER);
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        bookingQueue.addAll(bookingSet);

        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            String customer = booking.getIdCustomer();
            System.out.println("Đang tạo hợp đồng cho booking có thông tin : " + booking);
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin: " + customer);
            System.out.println("Nhập id hợp đồng");
            String idContract = input.nextLine();
            System.out.println("Nhập số tiền trả trước :");
            int prePay = Integer.parseInt(input.nextLine());
            System.out.println("Nhập tổng chi phí:");
            int totalPay = Integer.parseInt(input.nextLine());
            Contract contract = new Contract(customer, idContract, prePay, totalPay, booking.getIdBooking());
            contractList.add(contract);
            System.out.println("Đã tạo hợp đồng :" + contract.toString());
            String line = customer+ ","+idContract+ ","+prePay+ ","+totalPay+ ","+booking;
            ReadAndWrite.writeFile(FILE_NAME,line);

        }
    }
    @Override
    public void displayListContract() {
        List<String[]> list= ReadAndWrite.readFile(FILE_NAME);
        contractList.clear();
        for (String[] item :list) {
            contractList.add(new Contract(item[0],item[1],Integer.parseInt(item[2]),Integer.parseInt(item[3]),Integer.parseInt(item[4])));
        }
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
                int newDeposit= Integer.parseInt(input.nextLine());
                contractList.get(index).setDeposit(newDeposit);
                System.out.println("Nhập mới tổng chi phí");
                int newTotal= Integer.parseInt(input.nextLine());
                contractList.get(index).setTotalFee(newTotal);
            }else {
                System.out.println("Không có hợp đồng này !!");
                flag= false;
            }
        }
    }

}
