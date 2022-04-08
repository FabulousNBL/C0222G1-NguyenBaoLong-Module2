package _07_abstraction.exercise.resizeable;

public class SquareTest {
    public static void main(String[] args) {
        Square square= new Square(4,"black",true);
        square.resize(10);
        System.out.println(square);
    }
}
