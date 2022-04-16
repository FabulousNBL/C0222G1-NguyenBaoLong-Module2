package _11_stack_queue.exercise.treemap;

import java.util.Scanner;
import java.util.Set;

public class CountString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str= input.nextLine();
        String [] arr= str.toLowerCase().split(" ");

        java.util.TreeMap<String,Integer> treeMap= new java.util.TreeMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if (treeMap.containsKey(arr[i])){
                treeMap.put(arr[i],treeMap.get(arr[i])+1);
            }else{
                treeMap.put(arr[i],1);
            }
        }
        System.out.println(treeMap);
        Set<String> setKey= treeMap.keySet();
        for (String item:setKey) {
            System.out.println(item + " xuất hiện "+ treeMap.get(item)+" lần");
        }
    }
}
