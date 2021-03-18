package classworks.day5;

public class NestedLoopDemo {
    public static void main(String[] args) {
        System.out.println("i j");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
            System.out.println();
        }
    }
}
