package java_classes.polymorphism.overloading;

public class Main {
    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static int tinhTong(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int num1, num2;
        double c;
        num1 = tinhTong(1, 1);
        num2 = tinhTong(1, 2, 3);
        System.out.println(num1);
        System.out.println(num2);
    }
}
