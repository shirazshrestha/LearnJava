package assignments.assignments22_37;

//36. Write a function to find duplicate elements in an array.

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 4, 5};
        int duplicate = 0;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                    flag = true;
                    break;
                }
            }
            if (flag == true)
                break;
        }
        System.out.println("Duplicate element = " + duplicate);
    }
}
