package _03_array.practice;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String [] student= {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a student's name: ");
        String input_name= scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i <student.length ; i++) {
            if (student[i].equals(input_name)){
                System.out.println("position of the student in the list"+ input_name+"is:  "+i);
                isExist=true;
                break;
            }
        }if (!isExist){
            System.out.println("not found "+ input_name+" in the list");
        }
    }
}
