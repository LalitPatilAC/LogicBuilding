//Problem 4: User Input for Positive Numbers (Using do-while Loop)

//Problem Statement:
//Write a Java program that repeatedly asks the user to enter a positive number.
//1. Create a method askForPositiveNumber() that uses a do-while loop to ask the user for a number until they enter a positive number.
//2. Use the Scanner class to take the user’s input.
//3. Once a positive number is entered, the program should display the number.


import java.util.Scanner;

public class Number{

     public static void PositiveNumber(){
     int num;
     Scanner sc = new Scanner(System.in);
     do{
      System.out.println("Enter a positive number : ");
      num = sc.nextInt();

      if(num>0){
        System.out.println("You entered a positive number: "+num);
        break;
      }
      }while(true);

}
     
     public static void main(String main[]){

     PositiveNumber();

}

}


//Output:

//C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_3>javac Number.java

//C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_3>java Number
//Enter a positive number :
//0
//Enter a positive number :
//-5
//Enter a positive number :
//1
//You entered a positive number: 1