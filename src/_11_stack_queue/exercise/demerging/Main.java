package _11_stack_queue.exercise.demerging;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person>people=new ArrayList<>();
        people.add(new Person("long",18,true));
        people.add(new Person("Quang",17,true));
        people.add(new Person("Trung",20,true));
        people.add(new Person("Trang",18,false));
        people.add(new Person("Thi",19,false));

        Collections.sort(people);

        Queue<Person>Nam= new LinkedList<>();
        Queue<Person>Nu= new LinkedList<>();
        for (int i = 0; i <people.size() ; i++) {
            if (people.get(i).isGender()){
                Nam.add(people.get(i));
            }else {
                Nu.add(people.get(i));
            }
        }

        for (int i = 0; i < people.size(); i++) {
            if (!Nu.isEmpty()){
                people.set(i,Nu.poll());
            }else {
                people.set(i,Nam.poll());
            }
        }
        System.out.println(people);
    }
}
