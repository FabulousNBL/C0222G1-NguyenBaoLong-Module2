package _11_stack_queue.exercise.reverse;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str= input.nextLine();
        String [] mWord= str.split(" ");
        String outp="";
        System.out.println(Arrays.toString(mWord));
        Stack<String> stack= new Stack<>();
        for (int i = 0; i <mWord.length ; i++) {
            stack.push(mWord[i]);
        }
        System.out.println(stack);
        for (int i = 0; i <mWord.length-1 ; i++) {
            outp+= stack.pop()+" ";
        }
        outp+= stack.pop();
        System.out.println(outp);
//        for (int i = 0; i <mWord.length ; i++) {
//            mWord[i]= stack.pop();
//        }
//        System.out.println(Arrays.toString(mWord));

    }
}
