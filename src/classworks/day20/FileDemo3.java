package classworks.day20;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        String filePath = "C:/Users/shira/Desktop/test.txt";
        File file = new File(filePath);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        file.setWritable(false);
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.toString());

        filePath = "C:/Users/shira/Desktop/test/demo.txt";
        File file1 = new File(filePath);
        file.renameTo(file1);
    }
}
