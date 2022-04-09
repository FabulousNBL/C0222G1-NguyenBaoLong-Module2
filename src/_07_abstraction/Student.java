package _07_abstraction;

import java.util.Scanner;

public class Student {
    Scanner input = new Scanner(System.in);
    private String name;
    private int age;
    private String address;
    private int point;
    public Student(){

    }
    public Student(String name, int age, String address, int point){
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
    }

    @Override
    public String toString() {
        String str = "";
        return "Name: " + name + ", Age: " + age + ", Address: " + address + ", Point: " + point;
    }

}
