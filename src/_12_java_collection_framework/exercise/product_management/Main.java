package _12_java_collection_framework.exercise.product_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductManagement productManager = new ProductManagement();
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Menu");
            System.out.println("1.Hiện danh sách :");
            System.out.println("2.Thêm danh sách ");
            System.out.println("3.Sửa thông tin");
            System.out.println("4.Xoá sản phẩm theo id");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("6.Sắp xếp sản phẩm tăng dần");
            System.out.println("7 Sắp xếp sản phẩm giảm dần");
            System.out.println("8.Thoát");
            System.out.println("Chọn option :");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    productManager.display();
                    break;
                case 2:
                    productManager.addProduct();
                    break;
                case 3:
                    productManager.updateProduct();
                    break;
                case 4:
                    productManager.deleteProduct();
                    break;
                case 5:
                    productManager.searchByName();
                    break;
                case 6:
                    productManager.sortIncrease();
                    break;
                case 7:
                    productManager.sortDecrease();
                    break;
                case 8:
                    System.exit(8);
                    break;
            }
        }
    }
    }


