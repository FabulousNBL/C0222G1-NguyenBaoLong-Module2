package _10_list.exercise.array_list;

import java.util.Collections;

public class MainTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList= new MyList<>();
        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(4);

        integerMyList.add(2,18);

        System.out.println(integerMyList.get(1));
        System.out.println(integerMyList.get(3));
        System.out.println(integerMyList.get(2));
        System.out.println(integerMyList);
        integerMyList.remove(2);
        System.out.println(integerMyList);
        System.out.println(integerMyList.indexOf(3));
        System.out.println(integerMyList.contains(5));
        System.out.println(integerMyList.clone());


    }
}
