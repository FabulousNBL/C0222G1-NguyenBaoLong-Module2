package _19_string_regex.exercise.class_name_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static final String CLASSNAME_REGEX = "^[ACP]\\d{4}[GHIKLM]$";
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String className= scanner.nextLine();
        boolean check = Pattern.matches(CLASSNAME_REGEX,className);
        System.out.println(check);
    }
}
