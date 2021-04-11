package classworks.day20;

import java.io.FileReader;
import java.io.FileWriter;

//character stream
public class FileDemo5 {
    public static void main(String[] args) {
        String readFilePath = "C:/Users/shira/Desktop/test/demo.docx";
        String writeFilePath = "C:/Users/shira/Desktop/test/demo2.docx";

        try(
                FileReader fin = new FileReader(readFilePath);
                FileWriter fout = new FileWriter(writeFilePath);
                ){
            int len = 0;
            while((len = fin.read()) != -1){
                System.out.println(len);
                fout.write(len);
            }
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
