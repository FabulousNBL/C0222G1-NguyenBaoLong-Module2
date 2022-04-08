package _07_abstraction.exercise.resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[]shapes= new Shape[3];
        shapes[0]= new Circle(5,"red",true);
        shapes[1]=new Rectangle(4,5,"blue",true);
        shapes[2]=new Square(4,"gray",true);
        double percent=Math.random()*100;
        for (Shape shape:shapes
             ) {
            shape.resize(percent);
            System.out.println(shape);
        }
    }
}
