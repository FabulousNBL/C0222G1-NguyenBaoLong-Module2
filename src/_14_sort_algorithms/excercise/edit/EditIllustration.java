package _14_sort_algorithms.excercise.edit;

import java.util.Arrays;

public class EditIllustration {
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
        }
    }
}
