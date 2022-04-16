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

        Queue<Person>man= new LinkedList<>();
        Queue<Person>woman= new LinkedList<>();
        for (int i = 0; i <people.size() ; i++) {
            if (people.get(i).isGender()){
                man.add(people.get(i));
            }else {
                woman.add(people.get(i));
            }
        }

        for (int i = 0; i < people.size(); i++) {
            if (!woman.isEmpty()){
                people.set(i,woman.poll());
            }else {
                people.set(i,man.poll());
            }
        }
        System.out.println(people);
    }
}
