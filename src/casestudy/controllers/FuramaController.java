package casestudy.controllers;

import java.util.Scanner;

public class FuramaController {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
     displayMainMenu();
    }

    public static void displayMainMenu() {
        while (true) {
            System.out.println("Option:");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Display list employees");
                    System.out.println("2. Add new employee");
                    System.out.println("3. Edit employee");
                    System.out.println("4. Return main menu");
                    int choose1 = Integer.parseInt(input.nextLine());
                    switch (choose1) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            displayMainMenu();
                    }
                    break;
                case 2:
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit customer");
                    System.out.println("4. Return main menu");
                    int choose2 = Integer.parseInt(input.nextLine());
                    switch (choose2){
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            displayMainMenu();
                    }
                    break;
                case 3:
                    System.out.println("1. Display list facility");
                    System.out.println("1. Add new facility");
                    System.out.println("3. Display list facility maintenance");
                    System.out.println("4. Return main menu");
                    int choose3= Integer.parseInt(input.nextLine());
                    switch (choose3){
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            displayMainMenu();
                    }
                    break;
                case 4:
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new contracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                    int choose4= Integer.parseInt(input.nextLine());
                    switch (choose4){
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            displayMainMenu();
                    }
                    break;
                case 5:
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    int choose5= Integer.parseInt(input.nextLine());
                    switch (choose5){
                        case 1:
                        case 2:
                        case 3:
                            displayMainMenu();
                    }
                    break;
                case 6:
                    System.exit(6);
            }
        }
    }


}
