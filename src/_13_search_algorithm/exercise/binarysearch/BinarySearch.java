package _13_search_algorithm.exercise.binarysearch;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] array, int left, int right, int value) {

        while (left <= right) {
            int mid = (left + right) / 2;   //345
            if (array[mid] < value) {
                left=mid +1;
            } else if (value < array[mid]) {
                right=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
