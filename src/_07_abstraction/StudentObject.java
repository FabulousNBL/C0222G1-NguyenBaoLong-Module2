package _07_abstraction;

import java.util.Scanner;

public class StudentObject {
    static Scanner input = new Scanner(System.in);
    static int size = 10;
    static Student[] students = new Student[size];
    public static void main(String[] args) {
        students[0] = new Student( "Jack", 27, "Quang Nam", 9);
        students[1] = new Student("John", 26, "Da Nang", 9);
        students[2] = new Student("Susan", 27, "Da Nang", 8);
        while (true){
            System.out.println("Menu");
            System.out.println("1. Displaying the list of student.");
            System.out.println("2. Adding a student.");
            System.out.println("3. Removing a student.");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    displayStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
    public static void addStudent(){
        System.out.println("Enter the student's name:");
        String name = input.nextLine();
        System.out.println("Enter the student's age:");
        int age =  Integer.parseInt(input.nextLine());
        System.out.println("Enter the student's address:");
        String address = input.nextLine();
        System.out.println("Enter the student's point:");
        int point = Integer.parseInt(input.nextLine());
        int num =0;
        for (int i = 0; i <size ; i++) {
            if(students[i]==null){
                num = i;
                break;
            }
        }
        students[num] = new Student(name, age, address, point);
        System.out.println("Successfully adding!!");
        displayStudent();
    }
    public static void displayStudent(){
        for (int i = 0; i < size; i++) {
            if(students[i]!=null){
                System.out.println("The student at no " + i + "\n" + students[i]);
            }
        }
    }
    public static void removeStudent(){
        System.out.println("Enter the index of the the student you want to remove:");
        int index =  Integer.parseInt(input.nextLine());
        for (; index <size-1 ; index++) {
            students[index]=students[index+1];
        }
        System.out.println("Successfully deleting!!");
        displayStudent();
    }
}
