package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumByColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hàng: ");
        int m= input.nextInt();
        System.out.println("Cột:");
        int n= input.nextInt();

        int [][] arr= new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("nhập phần tử: ");
                arr[i][j]= input.nextInt();
                }
        }
        System.out.println(Arrays.deepToString(arr));
       congTheoCot(m,arr);
    }
    public static void congTheoCot(int b,int [][] arr){
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập cột muốn cộng");
        int k= input.nextInt();
        if (k>0 && k<b){
            for (int i = 0; i < b; i++) {
                sum += arr[i][k];
            }
        }
        System.out.println(sum);
    }
}
