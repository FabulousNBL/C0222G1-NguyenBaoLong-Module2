package _17_binary_file_serialization.excercise.product_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<Product> readToFile(String path) throws IOException {
        List<Product> products = new ArrayList<>();
        File file = new File(path);
        FileInputStream fileInputStream = null;
        ObjectInputStream ois = null;
        try {
            fileInputStream = new FileInputStream(file);
            ois = new ObjectInputStream(fileInputStream);
            products = (List<Product>) ois.readObject();
            return products;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            ois.close();
            fileInputStream.close();
        }
        return null;
    }

    public void writeToFile(String path, List<Product> products) throws IOException {
        File file= new File(path);
        FileOutputStream fileOutputStream= null;
        ObjectOutputStream ous= null;
        try{
            fileOutputStream= new FileOutputStream(file,false);
            ous= new ObjectOutputStream(fileOutputStream);
            ous.writeObject(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            ous.close();
            fileOutputStream.close();
        }
    }
}
