import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}

//Output-
E:\Cdac Assignments\LogicBuilding_Assignment_4>Javac EvenNumbers.java

E:\Cdac Assignments\LogicBuilding_Assignment_4>java EvenNumbers.java
Enter a number: 89
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88