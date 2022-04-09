package _07_abstraction.practice.deachien;



import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static Person[] people = new Person[10];

    public static void main(String[] args) {
        people[0] = new Student("Long", 20, true, 8);
        people[1] = new Student("Khoa", 20, true, 9);
        people[2] = new Teacher("Hương", 25, false, 10000000);
        people[3] = new Teacher("Nam", 23, true, 1000000);

        while (true) {
            System.out.println("Bạn muốn: ");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm học sinh");
            System.out.println("3. Thêm giáo viên");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Xóa giáo viên");
            System.out.println("6. Thoát");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    display();
                    break;
                case 2:
                    addStudent();
                case 3:
                    addTeacher();
                case 4:
                    deleteStudent();
                case 5:
                    deleteTeacher();
                case 6:
                    System.exit(6);
            }
        }
    }

    public static void display() {
        for (int i = 0; i < 10; i++) {
            if (people[i] != null) {
                System.out.println(people[i]);
            }
        }
    }

    public static void addStudent() {
        System.out.println("Enter student's name: ");
        String name = input.nextLine();
        System.out.println("Enter student's age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("1: Man      2. Woman");
        boolean gender = false;
        int choice = Integer.parseInt(input.nextLine());
        if (choice == 1) {
            gender = true;
        }
        System.out.println("Enter student's point: ");
        int point = Integer.parseInt(input.nextLine());
        int num = 0;
        for (int i = 0; i < 10; i++) {
            if (people[i] == null) {
                num = i;
                break;
            }
        }
        people[num] = new Student(name, age, gender, point);
        display();
    }


    public static void addTeacher() {
        System.out.println("Enter teacher's name: ");
        String name = input.nextLine();
        System.out.println("Enter teacher 's age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Enter teacher's salary: ");
        int salary = Integer.parseInt(input.nextLine());
        System.out.println("1: Man      2. Woman");
        boolean gender = false;
        int choice = Integer.parseInt(input.nextLine());
        if (choice == 1) {
            gender = true;
        }
        int num = 0;

        for (int i = 0; i < 10; i++) {
            if (people[i] == null) {
                num = i;
                break;
            }
        }
        people[num] = new Teacher(name, age, gender, salary);
        display();
    }

    public static void deleteStudent() {
        System.out.println("Enter the name that you want to delete: ");
        String name = input.nextLine();
        for (int i = 0; i < 10; i++) {
            if (people[i] == null) {
                break;
            } else if (name.equals(people[i].getName()) && people[i] instanceof Student) {
                for (int j = i; j < 10 - 1; j++) {
                    people[j] = people[j + 1];
                }
            }else {
                System.out.println("không có tên trong danh sách!");
                break;
            }
        }
        display();
    }

    public static void deleteTeacher(){
        System.out.println("Enter the name that you want to delete: ");
        String name = input.nextLine();
        for (int i = 0; i < 10; i++) {
            if (people[i] == null) {
                break;
            } else if (name.equals(people[i].getName()) && people[i] instanceof Teacher) {
                for (int j = i; j < 10 - 1; j++) {
                    people[j] = people[j + 1];
                }
            }else {
                System.out.println("không có tên trong danh sách!");
                break;
            }
        }
        display();
    }
}