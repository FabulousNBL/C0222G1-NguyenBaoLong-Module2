package _15_exception_debug.practice.arrayindexoutofbound;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try{
            ArrayExample arrayExample= new ArrayExample();
            Integer[] arr= arrayExample.createRandom();

            Scanner sc= new Scanner(System.in);
            System.out.println(" \nVui lòng nhập chỉ số của 1 phần tử bất kì");
            int x= sc.nextInt();
            System.out.println("Giá trị cỉa phần tử có chỉ số : "+ x+ " là "+ arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
