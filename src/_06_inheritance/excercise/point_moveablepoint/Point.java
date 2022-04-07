package _06_inheritance.excercise.point_moveablepoint;

import java.util.Arrays;

public class Point {
    protected float x,y;

    public Point(){
    }

    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        return new float[]{this.x,this.y};
    }


    @Override
    public String toString() {
        return "ArrayPoint "+"\n"+ Arrays.toString(getXY());
    }


}
