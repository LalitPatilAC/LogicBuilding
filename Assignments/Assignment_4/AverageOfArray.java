import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int num : arr) {
            sum = sum + num;
        }

        double average = (double) sum / arr.length;

        System.out.println("The average of the numbers is: " + average);
    }
}