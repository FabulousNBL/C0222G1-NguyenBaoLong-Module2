package casestudy.service.implement;

import casestudy.models.person.Customer;
import casestudy.service.CustomerService;
import casestudy.util.RegexData;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static List<Customer>customerList= new LinkedList<>();
    Scanner input = new Scanner(System.in);

    public static List<Customer> getCustomerList() {
        return customerList;
    }
    public static final String REGEX_BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$.";
//
//    public static void setCustomerList(List<Customer> customerList) {
//        CustomerServiceImpl.customerList = customerList;
//    }

    static {
        Customer customer= new Customer(123456,"Long","20","true","DN",
                                        "long@gmail","959515","KH1","Diamond");
        customerList.add(customer);

        Customer customer1= new Customer(234567,"Hương","20","false","DN",
                "huong@gmail","567895","KH2","Diamond");
        customerList.add(customer1);

        Customer customer2= new Customer(345678,"Linh","20","false","DN",
                "linh@gmail","873452","KH3","Gold");
        customerList.add(customer2);
    }
    @Override
    public void display() {
        for (int i = 0; i <customerList.size() ; i++) {
            if (customerList.get(i)!=null){
                System.out.println(customerList.get(i));
            }
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
            String address = input.next();
            System.out.println("Nhập email khách hàng");
            String email = input.next();
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
            System.out.println("Enter customer's new name");
            String name=input.next();
            customerList.get(index).setName(name);
            System.out.println("Enter customer's new age");
            String age= RegexData.regexAge(input.nextLine(),REGEX_BIRTHDAY);
            customerList.get(index).setDateOfBirth(age);
            System.out.println("Enter customer's new gender");
            System.out.println("1. Nam      2. Nữ");
            String gender = input.nextLine();
            customerList.get(index).setGender(gender);
            System.out.println("Enter customer's new address");
            String address= input.next();
            customerList.get(index).setAddress(address);
            System.out.println("Enter customer's new email");
            String email= input.next();
            customerList.get(index).setEmail(email);
            System.out.println("Enter customer's new phone");
            String phone=input.nextLine();
            customerList.get(index).setPhone(phone);

            System.out.println("Enter customer's new type");
            System.out.println("1. Diamond     2. Platinum      3. Gold       4. Silver      5. Member");
            String typeCustomer=input.nextLine();
            customerList.get(index).setCustomerType(typeCustomer);
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
