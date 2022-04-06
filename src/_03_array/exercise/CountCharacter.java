package _03_array.exercise;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String str1= input.nextLine();
        System.out.println("nhập kí tự");
        String str2=input.nextLine();
        countChar(str1,str2);
    }
    public static void countChar( String str1,String str2){
        int count =0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i)== str2.charAt(0)){
                count++;
            }
        }
        System.out.println(" kí tự "+str2+" xuất hiện: "+ count+ " lần");
    }
}
