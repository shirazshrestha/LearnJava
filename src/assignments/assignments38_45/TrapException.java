package assignments.assignments38_45;

//43. Write a program to trap the exception handling to trap the divided by zero and out of index value in array.

import java.lang.reflect.Array;

public class TrapException {
    public static void main(String[] args) {
        TrapException te = new TrapException();
        te.trapArithmeticException();
        te.trapArrayIndexOutOfBoundException();
    }

    public void trapArithmeticException() {
        int a = 1;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Arithmetic Exception Occured");
        }
    }

    public void trapArrayIndexOutOfBoundException() {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\n" + e.getMessage());
            System.out.println("ArrayIndexOutOfBoundException Occured");
        }

    }
}
