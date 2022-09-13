package case_study.casestudy.service.implement;

import case_study.casestudy.models.person.Employee;
import case_study.casestudy.service.EmployeeService;
import case_study.casestudy.util.ReadAndWrite;
import case_study.casestudy.util.RegexData;


import java.io.File;
import java.io.IOException;
import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {

    public static final String  FILE_NAME = "src\\case_study\\casestudy\\data\\employee\\employee.csv";
    public static final String REGEX_BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static List<String[]> listStr;

    public void display() {
//        for (String[] employee : Objects.requireNonNull(ReadAndWrite.readFile(FILE_NAME))) {
//            System.out.println(Arrays.toString(employee));
//        }
        listStr= ReadAndWrite.readFile(FILE_NAME);
        Employee employee;
        employeeList.clear();
        for (String[] item : listStr) {
            employee=new Employee(Integer.parseInt(item[0]),item[1],item[2],item[3],item[4],item[5],item[6],item[7],Integer.parseInt(item[8]),item[9],item[10]);
            employeeList.add(employee);
        }
        for (Employee temp : employeeList) {
            System.out.println(temp.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập mã nhân viên");
        String idEmployee = input.nextLine();
        boolean flag = true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployee().equals(idEmployee)) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            System.out.println("Đã có nhân viên này");
        } else {
            System.out.println("Nhập tên nhân viên mới:");
            String name = input.nextLine();
            System.out.println("Nhập CMND của nhân viên");
            int idPerson;
            while (true) {
                try {
                    idPerson = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Input wrong format");
                }
            }
            System.out.println("Nhập tuổi nhân viên");
            String age = RegexData.regexAge(input.nextLine(), REGEX_BIRTHDAY);
            System.out.println("1. Nam      2. Nữ");
            String gender = input.nextLine();
            System.out.println("Nhập địa chỉ nhân viên");
            String address = input.nextLine();
            System.out.println("Nhập email nhân viên");
            String email = input.nextLine();
            System.out.println("Nhập số điện thoại nhân viên");
            String phone = input.nextLine();
            System.out.println("Nhập lương nhân viên");
            int salary;
            while (true) {
                try {
                    salary = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Input wrong format");
                }
            }
            System.out.println("Nhập trình độ nhân viên");
            System.out.println("1. Trung cấp    2. Cao đẳng     3. Đại học      4. Sau đại học");
            String education = input.nextLine();
            System.out.println("Nhập vị trí nhân viên");
            System.out.println("1. Receptionist     2. Serve      3. Monitoring       4. Manager      5. Director");
            String position = input.nextLine();
            Employee employee = new Employee(idPerson,
                                            name,
                                            age,
                                            gender,
                                            address,
                                            email,
                                            phone,
                                            idEmployee,
                                            salary,
                                            education,
                                            position);
            employeeList.add(employee);
            String line = idPerson + "," + name + "," + age + "," + gender + "," + address + "," + email + "," + phone + "," + idEmployee + "," + salary + "," + education + "," + position;
            ReadAndWrite.writeFile(FILE_NAME, line);
            System.out.println("thanh cong");
        }
    }

    @Override
    public void edit() {
        listStr=ReadAndWrite.readFile(FILE_NAME);
        System.out.println("Enter employee's id");
        String idEmp = input.nextLine();
        boolean check = false;
        int index = 0;
        for (int i = 0; i < employeeList.size(); i++) {

            if (employeeList.get(i).getIdEmployee().equals(idEmp)) {
                index = i;
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Nhập mới tên nhân viên :");
            String name = input.nextLine();

            System.out.println("Nhập mới CMND của nhân viên");
            int idPerson;
            while (true) {
                try {
                    idPerson = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Input wrong format");
                    e.printStackTrace();
                }
            }

            System.out.println("Nhập mới tuổi nhân viên");
            String age = RegexData.regexAge(input.nextLine(), REGEX_BIRTHDAY);

            System.out.println("1. Nam      2. Nữ");
            String gender = input.nextLine();

            System.out.println("Nhập mới địa chỉ nhân viên");
            String address = input.nextLine();

            System.out.println("Nhập mới email nhân viên");
            String email = input.nextLine();

            System.out.println("Nhập mới số điện thoại nhân viên");
            String phone = input.nextLine();


            System.out.println("Nhập mới lương nhân viên");
            int salary;
            while (true) {
                try {
                    salary = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Input wrong format");
                }
            }

            System.out.println("Nhập mới trình độ nhân viên");
            System.out.println("1. Trung cấp    2. Cao đẳng     3. Đại học      4. Sau đại học");
            String education = input.nextLine();

            System.out.println("Nhập mới vị trí nhân viên");
            System.out.println("1. Receptionist     2. Serve      3. Monitoring       4. Manager      5. Director");
            String position = input.nextLine();

            employeeList.set(index, new Employee(idPerson, name, age, gender, address, email, phone, idEmp, salary, education, position));
            File file = new File(FILE_NAME);
            file.delete();
            List<String> empList= new ArrayList<>();
            for (Employee employee : employeeList) {
                String line = employee.getIdPerson() + "," + employee.getName() + "," + employee.getDateOfBirth() + "," +
                        employee.isGender() + "," + employee.getAddress() + "," + employee.getEmail() + "," +
                        employee.getPhone() + "," + employee.getIdEmployee() + "," + employee.getSalary() +
                        "," + employee.getEducation() + "," + employee.getPosition();
                empList.add(line);

            }
            ReadAndWrite.writePerson(FILE_NAME, empList);
            System.out.println("success");

        } else {
            System.out.println("This id hasn't been initialized");
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập mã nhân viên muốn xóa");
        String idDelete = input.nextLine();
        boolean check = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdEmployee().contains(idDelete)) {
                employeeList.remove(i);
                check = true;
                System.out.println("Remove success");
                break;
            }
        }
        if (!check) {
            System.out.println("Không có nhân viên này");
        }
    }
}
