package _12_java_collection_framework.practice.list_age;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap= new HashMap<>();
        hashMap.put("Long",18);
        hashMap.put("Trang",19);
        hashMap.put("Trinh",19);
        hashMap.put("Trung",19);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap+"\n");

        Map<String,Integer>treeMap= new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap= new LinkedHashMap<>(16, 0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Will", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Josh", 29);

        System.out.println("The age for "+"Lewis is "+ linkedHashMap.get("Lewis"));


    }
}
