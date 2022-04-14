package _11_stack_queue.exercise.reverse;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int [] array= new int [n];
        for (int i = 0; i <n ; i++) {
            array[i]=Integer.parseInt(input.nextLine());
        }
        Stack<Integer> stack= new Stack<>();
        for (int i = 0; i <n ; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i <n ; i++) {
            array[i]= stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
