package java_tutorial;

public class JavaForEach {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
        //----------------
        int[] nums = {1, 2, 3, 4, 5};
        int tong = 0;
        for (int num : nums) {
            tong += num;
        }
        System.out.println("Tong :" + tong);
    }
}
