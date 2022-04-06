package _02_loop.practice;

import java.util.Scanner;

public class TienLaiChoVay {
    public static void main(String[] args) {
        double money= 1.0;
        int month=1;
        double interesRate=1.0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter investment money: ");
        money= scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month= scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interesRate = scanner.nextDouble();
        double totalInterest =0;
        for (int i = 0; i <month ; i++) {
            totalInterest= money * (interesRate/100)/12* month;
        }
        System.out.println("total of interest: "+totalInterest);
    }
}
