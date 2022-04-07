package _06_inheritance.excercise.point_moveablepoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point= new Point(2,3);
        MovablePoint movablePoint= new MovablePoint(2,3,5,4);
        System.out.println(movablePoint.toString()+"\n"+movablePoint.move().toString());


    }
}
