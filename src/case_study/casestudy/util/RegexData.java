package case_study.casestudy.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner input = new Scanner(System.in);

    public static String regexStr(String temp, String regex, String error) {
        boolean flag = true;
        do {
            if (temp.matches(regex)) {
                flag = false;
            } else {
                System.out.println(error);
                temp = input.nextLine();
            }
        } while (flag);
        return temp;
    }

    public static String regexAge(String temp, String regex){
        boolean check =true;
        while (check){
            try{
                if (Pattern.matches(regex,temp)){
                    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age= LocalDate.parse(temp,formatter);
                    LocalDate now = LocalDate.now();
                    int current= Period.between(age,now).getYears();
                    if (current>18 && current<100){
                        check=false;
                    }else {
                        throw new AgeException("Tuổi phải lớn hơn 18 và bé hơn 100");
                    }
                }else {
                    throw new AgeException("Định dạng nhập vào không đúng");
                }
            } catch (AgeException e) {
                System.err.println(e.getMessage());
                temp= input.nextLine();
            }
        }
        return temp;
    }
}

