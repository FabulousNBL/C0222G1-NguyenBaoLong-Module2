package _14_sort_algorithms.excercise.edit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EditIllustration editIllustration= new EditIllustration();
        int[] array = {2, 4, 6, 87, 9, 1, 5};
        editIllustration.illustration(array);
        System.out.println("Sau khi đổi chỗ ");
        System.out.println(Arrays.toString(array));
    }
}
