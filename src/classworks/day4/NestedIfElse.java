package classworks.day4;

public class NestedIfElse {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 3;

        if (a > b) {
            if (a > c) {
                System.out.println("a is the largest one.");
            } else {
                System.out.println("c is the largest one.");
            }
        } else {
            if(a > c){
                System.out.println("a is smaller than b but greater than c.");
            }else{
                System.out.println("a is smaller than b and c.");
            }
        }

        System.out.println("more code");
        System.out.println("end of program.");
    }
}
