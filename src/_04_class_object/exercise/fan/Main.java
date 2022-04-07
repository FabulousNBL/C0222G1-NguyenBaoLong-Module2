package _04_class_object.exercise.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1= new Fan(true, 10,"yellow",3);
        Fan fan2= new Fan();
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
