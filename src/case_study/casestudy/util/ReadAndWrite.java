package case_study.casestudy.util;

import case_study.casestudy.models.facility.Facility;
import case_study.casestudy.models.facility.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public static Map<Facility,Integer> readBinary(String path){
        File file = new File(path);
        Object obj;
        try(FileInputStream fis= new FileInputStream(file);
        ObjectInputStream ois= new ObjectInputStream(fis))
        {
            obj= ois.readObject();
            return (Map<Facility, Integer>) obj;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
//
    public static List<String> readFileCsv(String filePath) {
        List<String> listLine = new ArrayList<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listLine;
    }

    public static void writFile(Object object, String path) {
        File file = new File(path);
        FileWriter outputfile = null;
        BufferedWriter bufferedWriter = null;
        try {
            outputfile = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(outputfile);
            bufferedWriter.write(object.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
            outputfile.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (outputfile != null) {
                    outputfile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
