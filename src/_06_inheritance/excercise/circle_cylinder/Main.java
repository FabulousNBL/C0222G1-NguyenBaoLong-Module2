package _06_inheritance.excercise.circle_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle();
        System.out.println(circle);

        Circle circle1=new Circle(2,"blue");
        System.out.println(circle1);

        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);

        Cylinder cylinder1= new Cylinder(5,3,"red");
        System.out.println(cylinder1);
    }
}
