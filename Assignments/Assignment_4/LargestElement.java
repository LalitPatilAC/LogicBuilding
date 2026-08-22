import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for (int num : arr) {
            largest = Math.max(largest, num);
        }

        System.out.println("The largest element is: " + largest);
    }
}