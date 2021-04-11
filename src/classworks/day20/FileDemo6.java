package classworks.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//bufferedReader
public class FileDemo6 {
    public static void main(String[] args) {
        String readFilePath = "C:/Users/shira/Desktop/test/demo1.txt";
        String writeFilePath = "C:/Users/shira/Desktop/test/demo2.txt";

        try(
                FileReader fin = new FileReader(readFilePath);
                BufferedReader br = new BufferedReader(fin);
                FileWriter fout = new FileWriter(writeFilePath);
                BufferedWriter bw = new BufferedWriter(fout);
        ){
            String len;
            while((len = br.readLine()) != null){
                System.out.println(len);
                bw.write(len);
                bw.newLine();
                bw.flush();
            }
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
