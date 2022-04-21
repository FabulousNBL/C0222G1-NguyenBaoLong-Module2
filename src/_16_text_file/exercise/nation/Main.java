package _16_text_file.exercise.nation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nation> nationList = new ArrayList<>();
        ReadAndWrite readAndWrite = new ReadAndWrite();
        try {
            List<String[]> listStr = readAndWrite.readFile("src\\_16_text_file\\exercise\\nation\\result.csv");

            for (String[] item : listStr) {
                Nation nation = new Nation((item[0]), item[1], item[2]);
                nationList.add(nation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Nation item : nationList) {
            System.out.println(item);
        }
    }
}
