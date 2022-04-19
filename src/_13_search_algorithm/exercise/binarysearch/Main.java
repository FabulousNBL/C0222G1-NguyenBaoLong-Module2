package _13_search_algorithm.exercise.binarysearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch= new BinarySearch();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int n= Integer.parseInt(input.nextLine());
        int [] arr= new  int[n];
        int m = arr.length-1;
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=Integer.parseInt(input.nextLine());
        }
        Arrays.sort(arr);
        System.out.println("After sort");
        System.out.println(Arrays.toString(arr));
        System.out.println("Finding");
        System.out.println(binarySearch.binarySearch(arr,1,18,5));
    }
}
