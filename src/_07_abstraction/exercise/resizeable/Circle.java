package _07_abstraction.exercise.resizeable;

public class Circle extends Shape {
    private double radius=1.0;

    public Circle(){}

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: "+"Radius: " + radius+"\t"+"\t"+ super.toString()
                +"\t"+"\t"+ "Area:"+this.getArea()+"\n";
    }

    @Override
    public void resize(double percent) {
        radius*= percent/100;
    }
}
