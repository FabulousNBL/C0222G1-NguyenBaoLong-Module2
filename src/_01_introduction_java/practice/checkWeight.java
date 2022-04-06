package _01_introduction_java.practice;

import java.util.Scanner;

public class checkWeight {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double height, weight, bmi;
        System.out.print("Your weight (in kilogram): ");
        weight= scanner.nextDouble();
        System.out.println("Your height (in meter): ");
        height= scanner.nextDouble();
        bmi= weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi", "Interpretation\n");
        if (bmi <18 ){
            System.out.printf("%-20s%s","bmi", "Underweight");
        }else if (bmi <25.0){
            System.out.printf("%-20s%s","bmi", "Normal");
        }else if (bmi<30.0){
            System.out.printf("%-20s%s","bmi", "Overweight");
        }else System.out.printf("%-20s%s","bmi", "Obese");
    }
}
