package _07_abstraction.exercise.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[]shapes= new Shape[3];
        shapes[0]=new Circle(5,"blue",true);
        shapes[1]=new Rectangle(3,4,"red",false);
        shapes[2]=new Square(4,"yellow",true);

        for (Shape item:shapes) {
            System.out.println(item);
            if (item instanceof Square) {
                Colorable colorable= (Square)item;
                colorable.howToColor();
            }

        }
    }
}
