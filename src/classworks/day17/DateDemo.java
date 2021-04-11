package classworks.day17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        printDate();
    }

    public static void printDate(){
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
        String parsedDate = sdf.format(date);
        System.out.println(parsedDate);
    }
}
