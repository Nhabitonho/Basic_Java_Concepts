package java_file_handling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\lonbui\\Desktop\\filename.txt");
        if (myObj.delete()){
            System.out.println("Delete the file: " + myObj.getName());
        }else {
            System.out.println("Failed to delete the file");
        }
    }

}
