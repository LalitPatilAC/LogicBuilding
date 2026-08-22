import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum = sum + i;
        }

        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
    }
}

//Output -
E:\Cdac Assignments\LogicBuilding_Assignment_4>javac SumOfOddNumbers.java

E:\Cdac Assignments\LogicBuilding_Assignment_4>java SumOfOddNumbers.java
Enter a number: 22
The sum of odd numbers from 1 to 22 is: 121