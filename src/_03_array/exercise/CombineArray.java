package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 1");
        int a= input.nextInt();
        System.out.println("Nhập độ dài mảng 2");
        int b= input.nextInt();
        int [] arr1= new int[a];
        int [] arr2= new int[b];

        for (int i = 0; i <arr1.length ; i++) {
            System.out.print("phần tử "+i+" mảng 1: ");
            arr1[i]=input.nextInt();
        }
        for (int j = 0; j <arr2.length ; j++) {
            System.out.print("phần tử "+j+" mảng 2: ");
            arr2[j]=input.nextInt();
        }
        gopMang(arr1,arr2);
    }
    public static void gopMang(int []arr1, int []arr2){
        int [] arrGop= new int[arr1.length+arr2.length];
        for (int k = 0; k <arrGop.length ; k++) {
            if (k<arr1.length){
                arrGop[k]=arr1[k];
            }else {
                arrGop[k]=arr2[k-arr1.length];
            }
        }
        System.out.println(Arrays.toString(arrGop));
    }
}
