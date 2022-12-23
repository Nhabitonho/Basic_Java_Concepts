package java_tutorial;

public class JavaArrays {
    public static void main(String[] args) {
        int[] diemMonHoc = {9, 8, 1, 7, 4};
        int tong = 0;
        Double diemTrungBinh;
        for (int diem : diemMonHoc) {
            tong += diem;
        }
        int doDaiMang = diemMonHoc.length;
        diemTrungBinh = ((double) tong / (double) doDaiMang);
        System.out.println("Tong : " + tong);
        System.out.println("Diem Trung Binh : " + diemTrungBinh);
    }
}
