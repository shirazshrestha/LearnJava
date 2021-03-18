package classworks.day5;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("===========");
    }
}
