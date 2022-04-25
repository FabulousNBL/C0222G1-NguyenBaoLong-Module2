package _17_binary_file_serialization.excercise.product_management;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ReadAndWrite readAndWrite = new ReadAndWrite();
    static Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();
    static final String FILE_NAME="src\\_17_binary_file_serialization\\excercise\\product_management\\product.txt";

    static {
        products.add(new Product("1a", "coca", "cola", 150000));
        products.add(new Product("2a", "sprite", "sprite", 150000));
        products.add(new Product("3a", "fanta", "fanta", 150000));
        products.add(new Product("4a", "pepsi", "pepsi", 150000));
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Display list product.txt");
            System.out.println("2. Add new product.txt");
            System.out.println("3. Search product.txt by id");
            System.out.println("4. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    try {
                        display();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        addNewProduct();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    searchByName();
                    break;
                case 4:
                    System.exit(4);
            }
        }


    }

    public static void display() throws IOException {
        products= readAndWrite.readToFile(FILE_NAME);
        for (Product item : products) {
            System.out.println(item);
        }
    }

    public static void addNewProduct() throws IOException {
        products= readAndWrite.readToFile(FILE_NAME);
        System.out.println("Nhập id sản phẩm");
        String idP = scanner.nextLine();
        boolean flag = false;


        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().contains(idP)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Đã có sản phẩm này");
        } else {
            System.out.println("Nhập tên sản phẩm mới");
            String name = scanner.nextLine();
            System.out.println("Nhập tên hãng sản xuất");
            String brand = scanner.nextLine();
            System.out.println("Nhập giá sản phẩm");
            int price = Integer.parseInt(scanner.nextLine());
            Product product = new Product(idP, name, brand, price);
            products.add(product);
            readAndWrite.writeToFile(FILE_NAME, products);
        }
    }

    public static void searchByName() throws IOException {
        products= readAndWrite.readToFile(FILE_NAME);
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(products.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Không có sản phẩm này");
        }
    }
}
