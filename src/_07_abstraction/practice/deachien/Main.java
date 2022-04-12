package _07_abstraction.practice.deachien;

import java.util.Scanner;

public class Main {
    public static Person[] people = new Person[10];
    static Scanner input = new Scanner(System.in);


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
            System.out.println("6. Danh sách học sinh");
            System.out.println("7. Danh sách giáo viên");
            System.out.println("8. Thoát");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    display();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    addTeacher();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    deleteTeacher();
                    break;
                case 6:
                    studentList();
                    break;
                case 7:
                    teacherList();
                    break;
                case 8:
                    System.exit(8);
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
        for (int i = 0; i < people.length; i++) {
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

        for (int i = 0; i < people.length; i++) {
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
        boolean flag=false;
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                break;
            } else if (name.equals(people[i].getName()) && people[i] instanceof Student) {
                for (int j = i; j < people.length - 1; j++) {
                    people[j] = people[j + 1];
                }
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println("không có");
        }
        display();
    }

    public static void deleteTeacher() {
        System.out.println("Enter the name that you want to delete: ");
        String name = input.nextLine();
        boolean flag = false;
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                break;
            } else if (name.equals(people[i].getName()) && people[i] instanceof Teacher) {
                for (int j = i; j < people.length - 1; j++) {
                    people[j] = people[j + 1];
                }
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("không có");
        }
        display();
    }

    public static void studentList() {
        for (Person item : people) {
            if (item instanceof Student) {
                Student student = (Student) item;
                System.out.println(student.toString());
            }
        }

    }

    public static void teacherList() {
        for (Person item : people) {
            if (item instanceof Teacher) {
                Teacher teacher = (Teacher) item;
                System.out.println(teacher.toString());
            }
        }

    }
}