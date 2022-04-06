package _02_loop.exercise;

import java.util.Scanner;

public class ShowShape {
    public static void main(String[] args) {
        int choice;
        Scanner input= new Scanner(System.in);
        while (true){
            System.out.println("Enter your choice: ");
            System.out.println("1. Draw the rectangle ");
            System.out.println("2. Draw the square triangle ");
            System.out.println("3. Draw the isosceles triangle ");
            System.out.println("0. Exit ");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter width: ");
                    float width= input.nextFloat();
                    System.out.println("Enter height: ");
                    float height=input.nextFloat();
                    for (float i = 1; i <= height; i++) {
                        for (float j = 1; j <= width ; j++) {
                            System.out.print("*");
                        }System.out.println();
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("Enter your choice: ");
                    System.out.println("1. Bot-left");
                    System.out.println("2. Top-left");
                    System.out.println("3. Top-Right");
                    System.out.println("4. Bot-Right");
                    int choice3=input.nextInt();
                    switch (choice3){
                        case 1:
                            for (int i = 1; i <= 5 ; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = 1; i <= 5 ; i++) {
                                for (int j = 5; j >=i ; j--) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i = 1; i <=5 ; i++) {
                                for (int j = 1; j <=i ; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 5; k >=i ; k--) {
                                    System.out.print("*");
                                }System.out.println();
                            }
                            break;
                        case 4:
                            for (int i = 1; i <=5 ; i++) {
                                for (int j = 5; j >i ; j--) {
                                    System.out.print(" ");
                                }
                                for (int k = 1; k <=i ; k++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        }
                            break;
                case 3:
                    System.out.println("Draw the isosceles triangle: ");
                    for (int a = 1; a <= 7; a++) {
                        for (int b = 7; b > a; b--) {
                            System.out.print(" ");
                        }
                        for (int c = 1; c <= a * 2 - 1; c++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
