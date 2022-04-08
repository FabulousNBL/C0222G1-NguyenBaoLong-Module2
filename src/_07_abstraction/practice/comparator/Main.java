package _07_abstraction.practice.comparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle[] circles= new Circle[3];
        circles[0]= new Circle();
        circles[1]= new Circle(5);
        circles[2]= new Circle(4,"red", true);


        System.out.println("Pre-sorted: ");
        for (Circle circle :circles) {
            System.out.println(circle);
        }

        Comparator circleComparator= new Comparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("After-sorted");
        for (Circle circle:circles) {
            System.out.println(circle);
        }
    }
}
