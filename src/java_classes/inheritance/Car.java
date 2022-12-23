package java_classes.inheritance;

public class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car newCar = new Car();
        // call honk() method from the vehicle class
        newCar.honk();
        System.out.println(newCar.brand + " " + newCar.modelName);
    }
}
