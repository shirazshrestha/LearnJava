package classworks.day4;

public class ElseIfDemo {
    public static void main(String[] args) {
        int marks = 80;

        if (marks >= 80 && marks <= 100){
            System.out.println("Distinction");
        }else if (marks >= 60 && marks <= 79){
            System.out.println("First Division");
        }else if (marks >= 50 && marks <= 59){
            System.out.println("Second Division");
        }else{
            System.out.println("Fail");
        }

        System.out.println("mode code");
        System.out.println("end of program");
    }
}
