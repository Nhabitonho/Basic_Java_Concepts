package exercise.exercise7;

public class MyAutoMobileShop {
    public static void main(String[] args) {
        Truck truck = new Truck(2001, 2022, "red", 5000 );
        Ford ford1 = new Ford(2000, 20,2022, "blue", 6000 );
        Ford ford2 = new Ford(2000, 10,2022, "black", 6000 );
        Car car = new Car(2022, "Yellow", 5000);
        BMW bmw = new BMW(21, 2022, "green", 10000);

        System.out.println("Truck " + truck.getSalePrice());
        System.out.println("Ford1 " + ford1.getSalePrice());
        System.out.println("Ford2 " + ford2.getSalePrice());
        System.out.println("Car " + car.getSalePrice());
        System.out.println("BMW " + bmw.getSalePrice());


    }
}
