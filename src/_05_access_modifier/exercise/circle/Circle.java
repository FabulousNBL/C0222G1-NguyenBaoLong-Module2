package _05_access_modifier.exercise.circle;

public class Circle {
    private double radius;
    private String color;

    Circle(double radius){
        this.radius=radius;
    }

    private double getRadius() {
        return radius;
    }
    private double getArea(){
        return radius*2*Math.PI;
    }
    public String toString(){
        return "The radius is "+ this.radius+" and area is "+ this.getArea();
    }

}
