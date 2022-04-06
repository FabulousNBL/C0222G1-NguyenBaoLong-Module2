package _05_access_modifier.practice.staticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";
    //Constructor to initialize the variable
    Student(int r,String n){
        rollno= r;
        name =n;
    }
    //static method to change the value of static variable
    static void change(){
        college="CODEGYM";
    }
    //method to display value
    void display(){
        System.out.println(rollno + " "+ name+ " "+ college);
    }

}
