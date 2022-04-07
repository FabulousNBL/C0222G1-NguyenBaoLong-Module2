package _06_inheritance.excercise.point2d_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float x,y,z;

    public Point3D(){
    }

    public Point3D(float x,float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void  setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        super.setXY(x,y);
        this.z=z;
    }

    public float[] getXYZ(){
        return new float[]{getX(),getY(),this.z};
    }

    @Override
    public String toString() {
        return "Array 3D "+ "\n"+ Arrays.toString(getXYZ());
    }
}
