package assignments.assignments22_37;

//35. Write a function to find the second largest number in a given array.

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 8, 11, 1};

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
        }

        System.out.println("Second largest = " + secondLargest);
    }
}
