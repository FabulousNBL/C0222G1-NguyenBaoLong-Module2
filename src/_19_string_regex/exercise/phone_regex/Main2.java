package _19_string_regex.exercise.phone_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phone = scanner.nextLine();
        String phoneRegex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        boolean validate = Pattern.matches(phoneRegex, phone);
        System.out.println(validate);
    }
}
