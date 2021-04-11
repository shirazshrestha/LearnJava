package assignments.assignments38_45;

//44. Write a program to store the name and address of 10 students in file and search address by given name.

import java.io.*;
import java.util.Scanner;

public class FileNameAddress {
    public static void main(String[] args) {

        String fileWritePath = "C:/Users/shira/Desktop/test/student.txt";

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        try {
            name = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(name);

    }
}
