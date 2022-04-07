package _04_class_object.exercise.fan;



public class Fan {
    private static final int SLOW=1,MEDIUM=2,FAST=3;
    private boolean on;
    private double radius;
    private String color;
    int speed;

    Fan(){
       this.speed= SLOW;
       this.on = false;
       this.radius=5;
       this.color ="blue";
    }
    Fan(boolean on, double radius, String color, int speed){
        this.on= on;
        this.radius=radius;
        this.color=color;
        this.speed=speed;
    }
    public String toString() {
        if (this.on==false) {
           return "Fan is off" + "\n" + "radius is " + this.radius + "\n" +
                    "color is " + this.color ;
        } else {
          return  "Fan is on" + "\n" + "radius is " + this.radius + "\n" +
                    "color is " + this.color+ "\n" + "speed is " + this.speed;
        }
    }
}
