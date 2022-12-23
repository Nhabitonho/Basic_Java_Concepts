package java_classes;

public class JavaRegex {
    public static void main(String[] args) {
        String[] strTest = { "","1602","1998","NMD98","1998d","nmdse"};
        // Kiểm tra xem chuỗi có chứa các chữ cái hay không
        for(String str: strTest){
            System.out.println("Chuỗi " + str+ str.matches(".*[a-zA-Z].*"));
        }
        System.out.println("____________");
        // kiểm tra xem chuỗi có chứa các chữ số hay không
        for(String str: strTest){
            System.out.println("Chuỗi " + str + str.matches(".*[0-9].*"));
        }
    }
}
