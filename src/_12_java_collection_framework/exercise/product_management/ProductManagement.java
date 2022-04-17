package _12_java_collection_framework.exercise.product_management;


import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.*;

public class ProductManagement {
    static List<Product> arrayList = new ArrayList<>();

    static {
        arrayList.add(new Product("Coca", 1, 15000));
        arrayList.add(new Product("Fanta", 2, 16000));
        arrayList.add(new Product("Sprite", 3, 25000));
        arrayList.add(new Product("Pepsi", 3, 18000));
    }

    static Scanner input = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Nhập id sản phẩm");
        int id= Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = input.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(input.nextLine());
        arrayList.add(new Product(name, id, price));
        display();
    }

    public void display() {

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public void updateProduct() {

        int count = 0;
        int index = 0;
        int countID = 0;
        int indexID = 0;
        System.out.println("Nhập id sản phẩm muốn cập nhật");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                index = i;
                count++;
                break;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                indexID = i;
                countID++;
            }
        }
        if (countID == 1) {
            if (count == 0) {
                System.out.println("Không có sản phẩm này");
            } else {
                System.out.println("Nhập tên mới cho sản phẩm");
                arrayList.get(index).setName(input.nextLine());
                System.out.println("Nhập giá mới cho sản phẩm");
                arrayList.get(index).setPrice(Integer.parseInt(input.nextLine()));
            }
        } else {
            System.out.println("Nhập id mới cho sản phẩm");
            arrayList.get(indexID).setId(Integer.parseInt(input.nextLine()));
        }
        display();
    }

    public void deleteProduct() {
        System.out.println("nhập id sản phẩm muốn xóa");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.remove(i);
                break;
            }
        }
        display();
    }

    public void searchByName() {
        System.out.println("nhập tên muốn tìm");
        String name = input.nextLine();
        for (Product product : arrayList) {
            if (product.getName().contains(name)) {
                System.out.println(product);

            }
        }
    }

    public void sortIncrease() {
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        display();
    }

    public void sortDecrease() {
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        display();
    }
}



