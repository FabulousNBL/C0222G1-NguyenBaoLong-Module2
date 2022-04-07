package _04_class_object.exercise.quadraticequation;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getA()==0){
            System.out.println(quadraticEquation.getRoot4());
        }else if (quadraticEquation.delta()>=0) {
            System.out.println(quadraticEquation.getRoot1()+"and "+quadraticEquation.getRoot2());
        }else if (quadraticEquation.delta()==0){

            System.out.println(quadraticEquation.getRoot3());
        }else {
            System.out.println("The equal has no roots");
        }
    }
}
