package classworks.day5;

public class MethodDemo1 {

    //method definition with declaration
    public static void greet(){
        System.out.println("Hello, good morning...");
    }

    public void displayInfo(String name, int age, double salary){
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Salary is: " + salary);
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        //method calling
        greet();

        MethodDemo1 ob = new MethodDemo1();
        String name = "ram";
        int age = 40;
        double salary = 5000.50;
        ob.displayInfo(name, age, salary);
    }
}
