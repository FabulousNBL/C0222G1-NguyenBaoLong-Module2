package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập chiều dài của mảng: ");
        int doDai= input.nextInt();
        duongCheo(doDai);
    }
    public static void duongCheo(int canh){
        int tongTrai=0;
        int tongPhai=0;
        Scanner input = new Scanner(System.in);
        int [][] arr= new int[canh][canh];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Nhập phần tử tại: "+i);
            for (int j = 0; j <arr.length ; j++) {
                arr[i][j]= input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0,j=arr.length-1; i <arr.length ; i++,j--) {
            tongTrai+= arr[i][i];
            tongPhai+= arr[i][j];
        }
        int tongCheo= tongPhai+ tongTrai;
        System.out.println(tongCheo);
    }
}
