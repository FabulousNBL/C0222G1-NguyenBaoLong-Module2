package _15_exception_debug.excercise.IllegalTriangleException;


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void negative(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Không được nhập số nhỏ hơn 0");
        }
        if (a + b < c || b + c < a || a + c < b) {
            throw new IllegalTriangleException("bạn đã nhập sai độ dai cạnh");
        }else {
            System.out.println("3 cạnh là 1 tam giác");
        }
    }

    public static void main(String[] args) {

        int a, b, c;
        while (true) {
            try {

                System.out.println("Nhập cạnh a");
                a = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập cạnh b");
                b = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập cạnh c");
                c = Integer.parseInt(sc.nextLine());
                negative(a, b, c);

                break;
            }catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("Mời nhập số");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
