package _14_sort_algorithms.practice.bubble_sort;

public class BubbleSort {


    public void bubbleShort(int [] list){
        boolean check= true;
        for (int i = 1; i <list.length && check; i++) {
            check=false;
            for (int j = 0; j <list.length-i ; j++) {
                if (list[j]>list[j+1]){
                    int temp= list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    check=true;
                }
            }
        }
    }
}
