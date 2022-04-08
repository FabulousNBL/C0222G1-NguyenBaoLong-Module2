package _07_abstraction.practice.comparable;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
