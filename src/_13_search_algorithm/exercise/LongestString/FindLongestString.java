package _13_search_algorithm.exercise.LongestString;

import java.util.LinkedList;
import java.util.Scanner;

public class FindLongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();

        System.out.println("Nhập chuỗi");
        String str = input.nextLine();
        max.add(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>max.getLast()){
                max.add(str.charAt(i));
            }
        }
        System.out.println(max);
    }
}
