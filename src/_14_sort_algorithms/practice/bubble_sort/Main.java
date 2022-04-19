package _14_sort_algorithms.practice.bubble_sort;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort= new BubbleSort();
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort.bubbleShort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");


    }
}
