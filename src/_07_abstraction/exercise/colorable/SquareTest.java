package _07_abstraction.exercise.colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square square= new Square(5,"red",true);
        square.howToColor();
        System.out.println(square);
    }
}
