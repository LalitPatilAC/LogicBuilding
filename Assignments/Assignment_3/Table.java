//Problem 5: Print Multiplication Table (Using for Loop)

//Problem Statement:
//Write a Java program that prints the multiplication table for a given number (e.g., number //5) using a for loop. The program should:
//1. Create a method printMultiplicationTable() that takes a number as a parameter and prints //its multiplication table from 1 to 10.
//2. Use a for loop to iterate through numbers 1 to 10 and print the multiplication results\

public class Table{

    public static void printMultiplicationTable(int num){
    for(int i = 1;i<=10;i++){
       System.out.println(num+"X"+i+"="+num*i);
}
}

    public static void main(String args[]){
    printMultiplicationTable(5);

}

}

//Output:

//C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_3>javac Table.java

//C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_3>java Table
//5X1=5
//5X2=10
//5X3=15
//5X4=20
//5X5=25
//5X6=30
//5X7=35
//5X8=40
//5X9=45
//5X10=50