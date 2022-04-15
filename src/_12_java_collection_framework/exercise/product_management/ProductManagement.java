package _12_java_collection_framework.exercise.product_management;


import java.util.*;

public class ProductManagement {
    public static List<Product> arrayList = new LinkedList<>();
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        arrayList.add(new Product("Coca", 1, 15000));
        arrayList.add(new Product("Fanta", 2, 16000));
        arrayList.add(new Product("Sprite", 3, 25000));
        arrayList.add(new Product("Pepsi", 3, 18000));



        while (true) {
            System.out.println("Bạn muốn: ");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm theo giá tăng dần");
            System.out.println("7. Sắp xếp sản phẩm theo giá giảm dần");
            System.out.println("0. Thoát");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    display();
                    break;
                case 2:
                    addProduct();

                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchByName();
                    break;
                case 6:
                    sortIncrease();
                    break;
                case 7:
                    sortDecrease();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public static void addProduct() {
        System.out.println("Nhập tên sản phẩm");
        String name = input.nextLine();
        System.out.println("Nhập id sản phẩm");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(input.nextLine());
        arrayList.add(new Product(name, id, price));
        display();
    }

    public static void display() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void updateProduct() {
        System.out.println("Nhập tên mới sản phẩm");
        String name = input.nextLine();
        System.out.println("Nhập id mới sản phẩm");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập giá mới sản phẩm");
        int price = Integer.parseInt(input.nextLine());
        boolean flag = true;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.remove(i);
                arrayList.add(new Product(name, id, price));
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("Không có id này");
        }
        display();
    }

    public static void deleteProduct() {
        System.out.println("nhập id sản phẩm muốn xóa");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.remove(i);
            }
        }
        display();
    }

    public static void searchByName() {
        System.out.println("nhập tên muốn tìm");
        String name = input.nextLine();
        for (Product p : arrayList) {
            if (p.getName().equals(name)) {
                System.out.println("có sản phẩm này " + p.getName());
                break;
            } else {
                System.out.println("không có sản phẩm này");

            }
        }

    }

    public static void sortIncrease() {
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        display();
    }

    public static void sortDecrease() {
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        display();
    }


}
