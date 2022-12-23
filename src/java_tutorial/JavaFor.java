package java_tutorial;

import java.util.Scanner;

public class JavaFor {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu");
        //Nhap mang
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        //Xuat mang
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" +a[i]);
        }

    }
}
