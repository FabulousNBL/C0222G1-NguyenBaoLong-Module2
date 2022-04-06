package _01_introduction_java.exercise;

import java.util.Scanner;

public class SwitchMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the money: ");
        double usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.println(" You will have " + vnd + " VND");
    }
}
