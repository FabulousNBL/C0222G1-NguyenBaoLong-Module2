package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class PushToArray {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       int [] arr1={1,2,3,4,5,6,7,0,0,0};
        System.out.println(Arrays.toString(arr1));
        System.out.print("Nhập vị trí cần chèn: ");
       int num1= Integer.parseInt(input.nextLine());
        System.out.print("Nhập giá trị chèn vào :");
       int changeNum1= Integer.parseInt(input.nextLine());
        themPhanTuVaoMang(arr1,num1,changeNum1);
    }
    public static void themPhanTuVaoMang(int[]arr, int num, int changeNum){
        for (int i = 0; i <arr.length ; i++) {
            if (i==num){
                for (int j = arr.length-1; j >num ; j--) {
                    arr[j]=arr[j-1];
                }
                arr[i]=changeNum;
                System.out.println(Arrays.toString(arr));
                break;
            }
        }
    }
}
