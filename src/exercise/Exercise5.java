package exercise;

import java.util.Scanner;

public class Exercise5 {
        public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap chieu cao tam giac :");
        n = scanner.nextInt();
        // mang 2 chieu
        for (int i = 1; i<=n;i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    //------------ tam giac 1 ----------------
//    public static void main(String[] args) {
//        int n;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Moi nhap chieu cao tam giac :");
//        n = scanner.nextInt();
//        String line = "";
//        for (int i = 1; i<n;i++){
//            line +=1;
//            System.out.println(line);
//        }
//    }
}
