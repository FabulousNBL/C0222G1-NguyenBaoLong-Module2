package case_study.casestudy.service.implement;

import case_study.casestudy.models.person.Customer;
import case_study.casestudy.models.person.Employee;
import case_study.casestudy.service.CustomerService;
import case_study.casestudy.util.ReadAndWrite;
import case_study.casestudy.util.RegexData;


import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static List<Customer> getCustomer(){
        List<Customer> customerList = new ArrayList<>();
        List<String[]> list = ReadAndWrite.readFile(FILE_NAME);
        for (String[] lists : list) {
            customerList.add(new Customer(
                    Integer.parseInt(lists[0]),
                    lists[1],
                    lists[2],
                    lists[3],
                    lists[4],
                    lists[5],
                    lists[6],
                    lists[7],
                    lists[8]));
        }
        return customerList;
    }
    public static List<String[]> list;
    public static List<Customer>customerList= new LinkedList<>();
    Scanner input = new Scanner(System.in);
    public static final String FILE_NAME="src\\case_study\\casestudy\\data\\customer\\customer.csv";

    public static final String REGEX_BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static void setCustomerList(List<Customer> customerList) {
        CustomerServiceImpl.customerList = customerList;
    }

    @Override
    public void display() {
        list= ReadAndWrite.readFile(FILE_NAME);
        Customer customer;
        customerList.clear();
        for (String[] item:list) {
            customer=new Customer(Integer.parseInt(item[0]),item[1],item[2],item[3],item[4],item[5],item[6],item[7],item[8]);
            customerList.add(customer);
        }
        for (Customer item:customerList) {
            System.out.println(item.toString());
        }

    }

    @Override
    public void addNew() {

        System.out.println("Nhập mã khách hàng");
        String idCustomer = input.nextLine();
        boolean flag = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomer().equals(idCustomer)) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            System.out.println("Đã có khách hàng này này");
        } else {
            System.out.println("Nhập tên khách hàng:");
            String name = input.nextLine();
            System.out.println("Nhập CMND của khách hàng");
            int idPerson ;
            while (true){
                try {
                    idPerson = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Input wrong format");
                }
            }
            System.out.println("Nhập tuổi khách hàng");
            String age = RegexData.regexAge(input.nextLine(),REGEX_BIRTHDAY);
            System.out.println("1. Nam      2. Nữ");
            String gender = input.nextLine();
            System.out.println("Nhập địa chỉ khách hàng");
            String address = input.nextLine();
            System.out.println("Nhập email khách hàng");
            String email = input.nextLine();
            System.out.println("Nhập số điện thoại khách hàng");
            String phone=input.nextLine();
            System.out.println("Nhập loại khách hàng:");
            System.out.println("1. Diamond     2. Platinum      3. Gold       4. Silver      5. Member");
            String typeCustomer = input.nextLine();
            Customer customer = new Customer(idPerson,
                    name,
                    age,
                    gender,
                    address,
                    email,
                    phone,
                    idCustomer,
                    typeCustomer);
            customerList.add(customer);
            String line= idPerson+","+name+","+age+","+gender+","+address+","+email+","+phone+","+idCustomer+","+typeCustomer;
            ReadAndWrite.writeFile(FILE_NAME,line);
            System.out.println("thành công");
        }
    }
    @Override
    public void edit() {

        System.out.println("Enter customer's id: ");
        String customerID= input.nextLine();
        boolean check=false;
        int index=0;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCustomer().equals(customerID)){
                check=true;
                index=i;
                break;
            }
        }
        if (check){
            System.out.println("Enter customer's idPerson");
            int idPerson= Integer.parseInt(input.nextLine());
            System.out.println("Enter customer's new name");
            String name=input.nextLine();

            System.out.println("Enter customer's new age");
            String age= RegexData.regexAge(input.nextLine(),REGEX_BIRTHDAY);

            System.out.println("Enter customer's new gender");
            System.out.println("1. Nam      2. Nữ");
            String gender = input.nextLine();

            System.out.println("Enter customer's new address");
            String address= input.nextLine();

            System.out.println("Enter customer's new email");
            String email= input.nextLine();

            System.out.println("Enter customer's new phone");
            String phone=input.nextLine();

            System.out.println("Enter customer's new type");
            System.out.println("1. Diamond     2. Platinum      3. Gold       4. Silver      5. Member");
            String typeCustomer=input.nextLine();

            customerList.set(index,new Customer(idPerson,name,age,gender,address,email,phone,customerID,typeCustomer));
            File file= new File(FILE_NAME);
            file.delete();

            for (Customer item :customerList) {
               String edit = item.getIdPerson()+","+item.getName()+","+item.getDateOfBirth()+
                        ","+item.isGender()+","+item.getAddress()+","+item.getEmail()+","+
                        item.getPhone()+","+item.getIdCustomer()+","+item.getCustomerType();
                ReadAndWrite.writeFile(FILE_NAME,edit);
            }

        }else {
            System.out.println("Chưa có khách hàng này!");
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter customer's id that want to delete");
        String customerID=input.nextLine();
        boolean check= false;
        for (int i = 0; i <customerList.size() ; i++) {
            if (customerList.get(i).getIdCustomer().contains(customerID)){
                customerList.remove(i);
                check=true;
                System.out.println("Removed");
                break;
            }
        }
        if (!check){
            System.out.println("This id is not exist!");
        }
    }
}
