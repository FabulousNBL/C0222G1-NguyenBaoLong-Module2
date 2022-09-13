package movieTheater.utils;

import movieTheater.model.Obj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String[]> readFileCsv(String path){
        List<String[]> list= new ArrayList<>();
        File file= new File(path);
        try {
            try(FileReader fileReader= new FileReader(file);
                BufferedReader bufferedReader= new BufferedReader(fileReader))
            {
                String line ="";
                while ((line=bufferedReader.readLine())!=null&& !line.equals("")){
                    String[] strings= line.split(",");
                    list.add(strings);
                }
                return list;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void writeFile(String path, List<String> stringList){
        File file= new File(path);
        if (!file.exists()){
            try{
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try(FileWriter fileWriter= new FileWriter(file,true);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter))
        {
            for (String item :stringList) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static <O> void writeFileObj(String path, List<O> list){
//        File file= new File(path);
//        if (!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        try(FileWriter fileWriter= new FileWriter(file);
//        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter))
//        {
//            for (Object item :list) {
//                bufferedWriter.write(((Obj)item).Obj());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
