package _06_inheritance.excercise.circle_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
    }

    public Cylinder(double height){
        this.height=height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume(){
        return this.getArea()*this.height*this.getRadius();
    }

    @Override
    public String toString() {
        return "A cylinder with height= "+this.height+", radius= "+ this.getRadius()+
                ", area= "+ this.getArea()+", volume= "+ this.getVolume();
    }
}
