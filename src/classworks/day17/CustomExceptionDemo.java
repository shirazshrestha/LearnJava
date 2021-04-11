package classworks.day17;

public class CustomExceptionDemo {

    public static void main(String[] args) {
        vote(8);
    }

    public static void vote(int age){
        if (age >= 18){
            System.out.println("You are eligible to vote.");
        }else{
            throw new InvalidAgeException("You cannot vote.");
        }
    }
}
