package _12_java_collection_framework.exercise.product_management;

import java.util.*;

public class ProductManagement {
    List<Product> products = new ArrayList<>(20);
    Scanner scanner = new Scanner(System.in);
    public void add(Product a){
        System.out.println("Nhập tên sản phẩm :");
        a.setName(scanner.nextLine());
        System.out.println("Nhập id vào :");
        a.setId(scanner.nextInt());
        System.out.println("Nhập giá muốn lựa chọn :");
        a.setPrice(scanner.nextInt());
        products.add(a);
    }
    public void display(){
        if(products.size() == 0){
            System.out.println("Không có");
        }else {
            for (Product item: products) {
                System.out.println(item);
            }
        }
    }
    public void removeById(){
        System.out.println("Nhập id muốn xoá :");
        int id = scanner.nextInt();
        Product temp = new Product();
        boolean check = false;
        if(products.isEmpty()){
            System.out.println("Không có id để xoá");
        }else {
            for (Product item:products) {
                if(item.getId() == id){
                    temp = item;
                    check = true;
                }
                if(!check){
                    System.out.println("Đã xoá id sản phẩm rồi");
                }
                products.remove(temp);
            }
        }
    }
    public void editById(){
        System.out.println("Nhập id muốn sửa :");
        int id = Integer.parseInt(scanner.nextLine());
        if(products.isEmpty()){
            System.out.println("Không có để sửa");
        }else {
            for (Product item: products) {
                if(item.getId() == id){
                    System.out.println("Nhập tên muốn sửa :");
                    item.setName(scanner.nextLine());
                    System.out.println("Nhập giá muốn sửa :");
                    item.setPrice(scanner.nextInt());
                }else {
                    System.out.println("Không có mà để sửa");
                    break;
                }
            }
        }
    }
    public void searchByName(){
        System.out.println("Nhập tên muốn tìm kiếm");
        String name = scanner.nextLine();
        if(products.isEmpty()){
            System.out.println("Không có");
        }else {
            for (Product item: products) {
                if(item.getName().equals(name)){
                    System.out.println("Có sản phẩm :" + item.getName());
                }else {
                    System.out.println("Không có");
                }
            }
        }
    }
    public void discount(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() -o1.getPrice();
            }
        });
        display();
    }
    public void priceIncrease(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }
}
