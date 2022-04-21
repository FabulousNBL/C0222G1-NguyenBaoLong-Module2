package _16_text_file.exercise.nation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<String[]> readFile(String path) throws IOException {
        List<String []>list= new ArrayList<>();
        File file= new File(path);
        FileReader fileReader= null;
        BufferedReader bufferedReader= null;
        try{
            fileReader= new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null && !line.equals("")){
                String [] array = line.split(",");
                list.add(array);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
        return list;
    }

}
