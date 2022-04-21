package _16_text_file.exercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readFile(String path) throws IOException {
        File file= new File(path);
        FileReader fileReader= null;
        BufferedReader bufferedReader= null;
        List<String> list= new ArrayList<>();
        try{
            fileReader= new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line ="";
            while ((line=bufferedReader.readLine())!=null&& !line.equals("")){
                list.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            bufferedReader.close();
        }
        return list;
    }

    public static void writeFile(String path, String line) throws IOException {
        File file= new File(path);
        FileWriter fileWriter= null;
        BufferedWriter bufferedWriter= null;

        try{
            fileWriter= new FileWriter(file,true);
            bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bufferedWriter.close();
        }
    }

    public static void main(String[] args) throws IOException {
        List<String> strings = readFile("src\\_16_text_file\\exercise\\copy_file_text\\source");
        for (int i = 0; i < strings.size() ; i++) {
            writeFile("src\\_16_text_file\\exercise\\copy_file_text\\result",strings.get(i));
        }
    }
}
