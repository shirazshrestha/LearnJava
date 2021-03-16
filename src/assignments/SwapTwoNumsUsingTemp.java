package assignments;

// 11. a.) Write a program to swap two numbers using temp variable - March 12, 2021

public class SwapTwoNumsUsingTemp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping!");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b= temp;

        System.out.println("---------------------");
        System.out.println("After Swapping!");
        System.out.println("a = " + a + ", b = " + b);
    }
}
