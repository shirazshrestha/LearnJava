package assignments.assignments22_37;

//28. Write a program in a single class having the following functions.
//isPrimenumber(int)
//firstNthPrime(int )
//allPrimebetween(int start , int  end)

public class Prime {
    public static void main(String[] args) {
        Prime number = new Prime();

        if (number.isPrimeNumber(8))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

        System.out.println("-----------");
        number.displayAllPrimeBetween(1, 10);
    }

    public boolean isPrimeNumber(int num) {

        //flag variable -> to tell if i is prime or not
        int flag = 1;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 0;
                break;
            }
        }

        if (flag == 1)
            return true;
        return false;

    }

    public void displayAllPrimeBetween(int start, int end) {
        int flag;
        for (int i = start; i <= end; i++) {
            if (i == 0 || i == 1)
                continue;

            //flag variable -> to tell if i is prime or not
            flag = 1;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1)
                System.out.print(i + " ");
        }
    }
}
