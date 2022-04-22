package _17_binary_file_serialization.practice.student_binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> studentList){
        try{
            FileOutputStream fos= new FileOutputStream(path);
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student>students= new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("src\\_17_binary_file_serialization\\practice\\student_binary\\student",students);
        List<Student> studentDataFromFile= readToFile("src\\_17_binary_file_serialization\\practice\\student_binary\\student");
        for (Student student: studentDataFromFile) {
            System.out.println(student);
        }
    }
    public static List<Student> readToFile(String path){
        List<Student> students= new ArrayList<>();
        try{
            FileInputStream fileInputStream= new FileInputStream(path);
            ObjectInputStream ois= new ObjectInputStream(fileInputStream);
            students= (List<Student>) ois.readObject();
            fileInputStream.close();
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
