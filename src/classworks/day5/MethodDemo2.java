package classworks.day5;

public class MethodDemo2 {

    public static int sum(){
        int a = 5;
        int b = 4;
        int s = a + b;
        return s;
    }

    public static String displayInfo(String name, int age, double salary){
        String info = "Name is: " + name + "\nAge is: " + age + "\nSalary is: " + salary;
        return info;
    }

    public static void main(String[] args) {
        int s = sum();
        System.out.println("Sum is: " + s);

        String name = "ram";
        int age = 44;
        double salary = 5000.54;
        String info = displayInfo(name, age, salary);
        System.out.println(info);
    }
}
