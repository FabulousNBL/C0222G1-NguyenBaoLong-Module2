package _05_access_modifier.practice.staticproperty;

public class staticProperty {
    public static void main(String[] args) {
        Car car1= new Car("Mazda 3", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
        Car car2= new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
