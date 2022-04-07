package _04_class_object.exercise.stopwatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        System.out.println("1: " + stopWatch.getStartTime());
        //bai toan
        int[] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 100000);
        }

        for (int i = 0; i <arr.length ; i++) {
            int max = arr[i];
            for (int j = i; j <arr.length-i ; j++) {
                if (arr[j]>max){
                    max=arr[j];
                    arr[j]=arr[i];
                    arr[i]=max;
                }
            }
        }


        System.out.println(Arrays.toString(arr));

        stopWatch.end();
        System.out.println("2: " + stopWatch.getEndTime());


        System.out.println(stopWatch.getElapsedTime());
    }
}
