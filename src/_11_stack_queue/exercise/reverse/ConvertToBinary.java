package _11_stack_queue.exercise.reverse;

import java.util.Scanner;
import java.util.Stack;


public class ConvertToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        String binary="";
        Stack<Integer>stack= new Stack<>();

        while (n>0){
            stack.push(n%2);
            n=n/2;
        }

        while (!stack.isEmpty()){
            binary+=stack.pop();
        }

        System.out.println(binary);
    }
}
