package _16_text_file.practice.read_and_write;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }
    public void writeFile( String filePath, int max){
        try{
            FileWriter writer= new FileWriter(filePath,true);
            BufferedWriter bufferedWriter= new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: "+ max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer>list){
        int max = list.get(0);
        for (int i = 1; i <list.size() ; i++) {
            if (max<list.get(i)){
                max= list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile= new ReadAndWriteFile();
        List<Integer>list= readAndWriteFile.readFile("src\\_16_text_file\\practice\\read_and_write\\test");
        int maxValue= findMax(list);
        readAndWriteFile.writeFile("src\\_16_text_file\\practice\\read_and_write\\nationaly", maxValue);
    }
}
