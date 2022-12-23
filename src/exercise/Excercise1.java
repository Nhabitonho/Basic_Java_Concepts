package exercise;

import java.util.Scanner;

public class Excercise1 {

    public static void main(String[] args) {
        int a,b;
        char s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so thu nhat : ");
        a = scanner.nextInt();
        System.out.println("Moi nhap so thu hai : ");
        b = scanner.nextInt();
        System.out.println("Tong : " + (a+b));
        System.out.println("Hieu : " + (a-b));
        System.out.println("Tich : " + a*b);
        if(b == 0){
            System.out.println("So bi chia phai khac khong !!");
        }else {
            System.out.println("Thuong : " + (float) a/b);
        }
        if(a > b){
            System.out.println(a +" is larger");
        } else if (b >a) {
            System.out.println(b + " is larger");
        } else{
            System.out.println("These mumbers are equal");
        }

    }
}
