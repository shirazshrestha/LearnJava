package assignments;

// 10. Write a Program for the following Mathematical Function.
// a.) s = ut + 1/2 at^2
// b.) area = Math.sqrt(s * (s-a) * (s-b) * (s-c))
// c.) x = - b + Math.sqrt(b^2 - 4ac) / 2a

public class MathematicalFunction {
    public static void main(String[] args) {
        System.out.println("10. a) s = ut + 1/2 at^2");
        double u = 5;
        double t = 10;
        double a = 9.8;
        double s = u * t + (1 / 2) * a * t * t;
        System.out.println("s = " + s);
        System.out.println("-----------------------------------------------------");

        System.out.println("10. b) area = Math.sqrt(s * (s-a) * (s-b) * (s-c))");
        double a2 = 5;
        double b2 = 2;
        double c2 = 7;
        double s2 = (a2 + b2 + c2) / 2;
        double area = Math.sqrt(s2 * (s - a2) * (s - b2) * (s2 - c2));
        System.out.println("area = " + area);
        System.out.println("-----------------------------------------------------");

        System.out.println("10. c.) x= - b + Math.sqrt(b^2 - 4ac) / 2a");
        double b3 = 10;
        double a3 = 2;
        double c3 = 5;
        double x = (-b3 + Math.sqrt(b3 * b3 - 4 * a3 * c3)) / 2 * a3;
        System.out.println("x = " + x);
        System.out.println("-----------------------------------------------------");

    }
}
