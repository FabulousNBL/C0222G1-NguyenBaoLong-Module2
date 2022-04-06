package _05_access_modifier.practice.staticMethod;

public class StaticMethod {
    public static void main(String[] args) {
        Student.change();
         //creating object
        Student s1= new Student(111, "Hoang");
        Student s2= new Student(222, "Khanh");
        Student s3= new Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();

    }
}
