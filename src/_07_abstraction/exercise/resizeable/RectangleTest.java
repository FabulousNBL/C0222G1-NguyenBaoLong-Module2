package _07_abstraction.exercise.resizeable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(3,5,"blue",false);
        rectangle.resize(10);
        System.out.println(rectangle);
    }
}
