import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(in.nextInt());
        }

        int secondLargest = findSecondLargest(a);
        System.out.println(secondLargest);
    }

    public static int findSecondLargest(ArrayList<Integer> a) {
        if (a.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two numbers.");
        }

        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num; // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num; // Update second largest if not equal to largest
            }
        }

        return secondLargest;
    }
}
