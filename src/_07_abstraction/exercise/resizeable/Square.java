package _07_abstraction.exercise.resizeable;

public class Square extends Shape implements Resizeable{
    private double side=1.0;

    public Square(){
    }

    public Square(double side){
        this.side=side;
    }

    public Square(double side,String color, boolean filled){
        super(color, filled);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }

    public double getPerimeter(){
        return 4*side;
    }
    @Override
    public void resize(double percent){
        side*=percent/100;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +"\t"+super.toString()+
                '}';
    }
}
