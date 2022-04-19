package _14_sort_algorithms.excercise.illustration_insertion_sort;

import java.util.Arrays;

public class Main {
    public static void illustration(int[] arr) {
        int num,j;
        for (int i = 1; i < arr.length; i++) {
            num = arr[i];
             j = i;
            while (j > 0 && num < arr[j - 1]) {
                arr[j] = arr[j -1];
                j--;
            }
            arr[j] = num;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 87, 9, 1, 5};
        illustration(array);
    }
}
