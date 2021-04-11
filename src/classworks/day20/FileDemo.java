package classworks.day20;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        String filePath = "C:/Users/shira/Desktop/demo.txt";
        File file = new File(filePath);
        try {
            if (file.createNewFile()){
                System.out.println("File Created");
            }else{
                System.out.println("File Already Exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
