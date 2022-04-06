package _05_access_modifier.exercise.student;

public class Main {
    public static void main(String[] args) {
        Student student= new Student();
        student.setName("Long");
        student.setClasses("C0222G1");
        System.out.println(student.getClasses());
        System.out.println(student.getName());
    }
}
