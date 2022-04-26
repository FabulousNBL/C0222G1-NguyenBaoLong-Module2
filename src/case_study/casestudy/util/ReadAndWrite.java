package casestudy.util;

import casestudy.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<Employee> readFile(String path) {
        List<Employee> list = new ArrayList<>();
        File file = new File(path);

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {

                String[] arrStr = line.split(",");
                Employee employee = new Employee(
                        Integer.parseInt(arrStr[0]), arrStr[1],arrStr[2],arrStr[3],arrStr[4],arrStr[5],arrStr[6],arrStr[7],Integer.parseInt(arrStr[8]),arrStr[9],arrStr[10]
                );
                list.add(employee);
            }
            return list;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(String path, String listLine) {
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file, false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(listLine);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
