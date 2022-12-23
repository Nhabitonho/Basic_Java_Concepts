package java_file_handling;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\lonbui\\Desktop\\filename.txt");
        if (myObj.exists()){
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path" + myObj.getPath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("File size in bytes : " + myObj.length());
        }else {
            System.out.println("File isn't exits");
        }
    }
}
