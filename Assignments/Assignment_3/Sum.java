//Problem 1: Sum of Two Numbers (Using a Method)
 
//Problem Statement:
//Write a Java program that includes a method to calculate the sum of two numbers. 
//1. Create a method sumOfTwoNumbers() that takes two integers as parameters, calculates //their sum, and returns the result. 
//2. In the main method, use the Scanner class to prompt the user to enter two integers. 
//3. Pass the user inputs to the sumOfTwoNumbers() method and print the sum


import java.util.Scanner;
public class Sum{

     static int sumOfTwoNumbers(int a,int b){

          return a+b;
}

      public static void main(String args[]){

       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter num1 : ");
       int num1 = sc.nextInt();
       System.out.println("Enter num2 : ");
       int num2 = sc.nextInt();

       System.out.println("Sum of two number is : "+sumOfTwoNumbers(num1,num2));

}

}


                               //Output :

//C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_3>javac Sum.java

//C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_3>java Sum
//Enter num1 :
//10
//Enter num2 :
//20
//Sum of two number is : 30
