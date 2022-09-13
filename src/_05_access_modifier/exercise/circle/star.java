package _05_access_modifier.exercise.circle;

public class star {
    public static void main(String[] args) {
        for (int i = 1; i <=6 ; i++) {
            for (int j = 6; j > i; j--) {
                System.out.println(" ");
            }
            for (int k = 1; k <=i*2-1 ; k++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
//     System.out.println("Draw the isosceles triangle: ");
//                    for (int a = 1; a <= 7; a++) {
//        for (int b = 7; b > a; b--) {
//            System.out.print(" ");
//        }
//        for (int c = 1; c <= a * 2 - 1; c++) {
//            System.out.print("*");
//        }
//        System.out.println();
//    }
}
