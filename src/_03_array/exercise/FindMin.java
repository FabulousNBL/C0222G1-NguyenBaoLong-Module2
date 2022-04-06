package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhập số phần tử ");
        int n = input.nextInt();
        int [] arr1= new int[n];

        for (int i = 0; i <n ; i++) {
            System.out.print(" nhập phần tử thứ " + i+ " ");
            arr1[i] = input.nextInt();
        }
        min(arr1,n);
    }
    public static void min(int []arr,int a){
        int min = arr[0];
        for (int i = 1; i <a ; i++) {
            if (arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Giá trị nhỏ nhất là:  "+min);
    }
}
