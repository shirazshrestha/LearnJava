package classworks.day20;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        String path = "C:/Users/shira/Desktop/test";
        File file = new File(path);
        file.mkdir();
    }
}
