package _15_exception_debug.excercise.IllegalTriangleException;


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void negative(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Không được nhập số nhỏ hơn 0");
        }
    }
    public static void compare(int a, int b, int c)throws IllegalTriangleException{
        if (a + b < c || b + c < a || a + c < b) {
            throw new IllegalTriangleException("bạn đã nhập sai độ dai cạnh");
        }
    }
    public static void main(String[] args) {
        boolean flag= true;
        int a, b, c;
        while (flag) {
            try {
                flag=false;
                System.out.println("Nhập cạnh a");
                a = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập cạnh b");
                b = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập cạnh c");
                c = Integer.parseInt(sc.nextLine());
                negative(a, b, c);
                compare(a,b,c);
            }catch (NumberFormatException e){
                System.out.println("Mời nhập số");
                flag= true;
            }catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                flag=true;
            }
        }
    }
}
