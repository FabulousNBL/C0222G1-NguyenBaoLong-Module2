package casestudy.controllers;

import casestudy.models.person.Employee;
import casestudy.service.implement.*;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    static Scanner input = new Scanner(System.in);

    public void displayMainMenu() throws Exception {
        boolean check = true;
        int choice=0;
        while (true) {
            System.out.println("Option:");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("0. Exit");

            try{
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }
            switch (choice){
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại");
            }
        }
    }

    public void employeeManagement() throws Exception {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int choose1=0;
        while (true) {
            System.out.println("Option:");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");

            try{
                choose1 = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }
            switch (choose1) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    displayMainMenu();
            }
        }

    }

    public void customerManagement() throws Exception {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int choose2=0;
        while (true) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            try{
                choose2 = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }
            switch (choose2) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    displayMainMenu();
            }
        }
    }

    public void facilityManagement() throws Exception {
        FacilityServiceImpl facilityService= new FacilityServiceImpl();
        int choose3=0;
        while (true){
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            try{
                choose3 = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }
            switch (choose3){
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addFacility();
                    break;
                case 3:
                    facilityService.displayMaintain();
                case 4:
                    displayMainMenu();
            }
        }
    }
    public void addFacility() throws Exception {
        FacilityServiceImpl facilityService= new FacilityServiceImpl();
        int choose1= 0;
        while (true){
            System.out.println("1. Add new villa");
            System.out.println("2. Add new house");
            System.out.println("3. Add new room");
            System.out.println("4. Return Facility Management");
            try{
                choose1 = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }
            switch (choose1){
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    facilityManagement();
            }
        }
    }
    public void bookingManagement() throws Exception {
        BookingServiceImpl bookingService= new BookingServiceImpl();
        ContractServiceImpl contractService= new ContractServiceImpl();
        int choose1=0;
        while (true){
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contract");
            System.out.println("4. Display contract list");
            System.out.println("5. Return Facility Management");
            try{
                choose1 = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }
            switch (choose1){
                case 1:
                    bookingService.addNew();
                    break;
                case 2:
                    bookingService.displayListBooking();
                    break;
                case 3:
                    contractService.createNewContract();
                    break;
                case 4:
                    contractService.displayListContract();
                    break;
                case 5:
                    facilityManagement();
                    break;
            }
        }
    }

}