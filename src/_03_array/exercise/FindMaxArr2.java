package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxArr2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Nhập số hàng:");
        int m = input.nextInt();
        System.out.print("Nhập số cột");
        int n = input.nextInt();
        findMax(m,n);
    }
    public static void findMax(int a, int b){
        Scanner input= new Scanner(System.in);
        int [][]arr = new int[a][b];
        int max= arr[0][0];
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <b ; j++) {
                System.out.println("Nhập phần tử "+j);
                arr[i][j]= input.nextInt();
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(max);
    }
}
