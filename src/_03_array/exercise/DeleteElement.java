package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount;
        do {
            System.out.println(" Nhập số phần tử của mảng : ");
            amount = input.nextInt();
        } while (amount <= 0);
        int[] arr = new int[amount];
        System.out.println("Nhập phần tử của mảng : ");
        for (int i = 0; i < amount; i++) {
            System.out.println("Nhập phần tử " + i);
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập số cần xóa : ");
        int b = input.nextInt();
        Delete(arr,b);
    }
    public static void Delete(int [] arr1,int b1){
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (b1 == arr1[i]) {
                index = i;
            }

        }
        for (int i = index; i < arr1.length - 1; i++) {
            arr1[i] = arr1[i + 1];
        }
        arr1[arr1.length - 1] = 0;
        System.out.println(Arrays.toString(arr1));
    }
}
