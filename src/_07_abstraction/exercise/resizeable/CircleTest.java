package _07_abstraction.exercise.resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle= new Circle(5,"red",false);
        circle.resize(5);
        System.out.println(circle);
    }
}
