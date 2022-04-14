package _11_stack_queue.exercise.brackets;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static boolean check(String str) {
        char left;
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            left = str.charAt(i);
            if (left == '(') {
                bStack.push(left);
            }else if (left == ')' ) {
                if (bStack.isEmpty()) {
                    return false;
                } else {
                    bStack.pop();
                }
            }
        }
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(check(str));
    }
}
