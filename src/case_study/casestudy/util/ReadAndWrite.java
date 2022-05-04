package case_study.casestudy.util;

import case_study.casestudy.models.facility.Facility;
import case_study.casestudy.models.facility.Villa;

import java.io.*;
import java.util.*;

public class ReadAndWrite {
    public static List<String[]> readFile(String path) {
        List<String[]> list = new ArrayList<>();
        File file = new File(path);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                list.add(arrStr);
            }
            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Set<String> readSet(String path){
        Set<String> set= new LinkedHashSet<>();
        File file= new File(path);
        try(FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader))
        {
            String line="";
            while ((line= bufferedReader.readLine())!=null && !line.equals("")){
                set.add(line);
            }
            return set;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFile(String path, String line) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileWriter fileWriter = new FileWriter(file,true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static Set<> readBinary(String path){
//        File file = new File(path);
//        Object obj;
//        try(FileInputStream fis= new FileInputStream(file);
//        ObjectInputStream ois= new ObjectInputStream(fis))
//        {
//            obj= ois.readObject();
//            return (Map<Facility, Integer>) obj;
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    public static void writeFacility(String path,String line){
//        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
//            System.out.println("Service " + element.getKey() + " rent: " + element.getValue());
//        }
//
//        Map<Facility,Integer> readMap = new Map <Facility, Integer>();
//    }

}
