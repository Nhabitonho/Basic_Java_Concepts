package exercise;

import java.util.Scanner;

public class Exercise4 {
    public static int month(int m) {
        switch (m) {
            case (1):
                System.out.println("Thang mot");
                break;
            case (2):
                System.out.println("Thang hai");
                break;
            case (3):
                System.out.println("Thang ba");
                break;
            case (4):
                System.out.println("Thang tu");
                break;
            case (5):
                System.out.println("Thang nam");
                break;
            case (6):
                System.out.println("Thang sau");
                break;
            case (7):
                System.out.println("Thang bay");
                break;
            case (8):
                System.out.println("Thang tam");
                break;
            case (9):
                System.out.println("Thang chin");
                break;
            case (10):
                System.out.println("Thang muoi");
                break;
            case (11):
                System.out.println("Thang muoi mot");
                break;
            case (12):
                System.out.println("Thang muoi hai");
                break;
            default:
                throw new IllegalArgumentException("Thang khong hop le !");
        }
        return 0;
    }

        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap thang : ");
        int m = scanner.nextInt();
        month(m);

    }
    //-----------------------------------------------
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Moi nhap thang : ");
//        String a = scanner.nextLine();
//        int b = Integer.parseInt(a);
//        try {
//            String [] months = {"Thang mot","Thang hai","Thang ba","Thang tu","Thang nam","Thang sau","Thang bay","Thang tam","Thang chin","Thang muoi","Thang muoi mot","Thang muoi hai",};
//            System.out.println(months[b-1]);
//        }catch (Exception e){
//            System.out.println("Thang khong hop le !");
//        }
//    }
    //-----------------------------------------------
//    public static void main(String[] args) {
//        String[] months = {"Thang mot", "Thang hai", "Thang ba", "Thang tu", "Thang nam", "Thang sau", "Thang bay", "Thang tam", "Thang chin", "Thang muoi", "Thang muoi mot", "Thang muoi hai",};
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Moi nhap thang : ");
//        int a = scanner.nextInt();
//        if (a>0 && a<13) {
//            System.out.println(month(a));
//        }else
//            System.out.println("Thang khong hop le : ");
//    }
}
