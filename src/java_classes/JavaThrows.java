package java_classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaThrows {
    private static int nhapTuoiNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tuổi nhân viên: ");
        int tuoi = scanner.nextInt();
        return tuoi;
    }

    public static void main(String[] args) {
        try {
            int tuoi = nhapTuoiNhanVien();
            System.out.println("Tuoi :" + tuoi);
        }catch (InputMismatchException e){
            throw new IllegalArgumentException("Tuoi khong hop le !!");
        }
    }
}
