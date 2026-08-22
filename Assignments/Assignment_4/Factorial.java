import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + n + " is " + factorial);
    }
}

//Output -

E:\Cdac Assignments\LogicBuilding_Assignment_4>javac Factorial.java

E:\Cdac Assignments\LogicBuilding_Assignment_4>java Factorial.java
Enter a number: 33
Factorial of 33 is 3400198294675128320