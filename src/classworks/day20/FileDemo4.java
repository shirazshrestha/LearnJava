package classworks.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//byte stream
public class FileDemo4 {
    public static void main(String[] args) {
        String readFilePath = "C:/Users/shira/Desktop/Project details and tools.docx";
        String writeFilePath = "C:/Users/shira/Desktop/test/demo.docx";

        try (
                FileInputStream fin = new FileInputStream(readFilePath);
                FileOutputStream fout = new FileOutputStream(writeFilePath);
        ) {
            int len = 0;
            while((len = fin.read()) != -1){
                System.out.println(len);
                fout.write(len);
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
