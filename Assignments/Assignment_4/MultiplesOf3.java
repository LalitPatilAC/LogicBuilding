import java.util.Scanner;

public class MultiplesOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 3; i <= n; i += 3) {
            System.out.print(i + " ");
        }
    }
}

// Output 
E:\Cdac Assignments\LogicBuilding_Assignment_4>javac MultiplesOf3.java

E:\Cdac Assignments\LogicBuilding_Assignment_4>java MultiplesOf3.java
Enter a number: 33
3 6 9 12 15 18 21 24 27 30 33