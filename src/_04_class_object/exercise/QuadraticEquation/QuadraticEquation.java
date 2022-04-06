package _04_class_object.exercise.QuadraticEquation;

public class QuadraticEquation {
   double a,b,c;
   QuadraticEquation(){

   }

    public QuadraticEquation(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public double delta(){
       return Math.pow(b,2)- 4*a*c;
    }
    public double getRoot1(){
       return (-b+Math.sqrt(Math.pow(b,2)-4*a*c)/2*a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(Math.pow(b,2)-4*a*c)/2*a);
    }
    public double getRoot3(){
       return (-b)/a;
    }
    public double getRoot4(){
       return -c/b;
    }
}

