//Problem 2: Simple Age Checker (Using a Method) 

//Problem Statement: 
//Write a Java program that includes a method to check the age category. 
//1. Create a method checkAgeCategory() that takes an integer (age) as a parameter and prints //whether the user is a minor, adult, or senior citizen. 
//2. In the main method, use the Scanner class to prompt the user to enter their age. 
//3. Pass the user's age to the checkAgeCategory() method. 


import java.util.Scanner;

public class Age{
           
      public static String AgeChecker(int age){
          
          if(age>18 && age<=60){
            //System.out.println("Adult");
            return "Adult";
          }else if(age>60 && age<=100){
            //System.out.println("Senior citizen");
            return "Senior citizen";
          }else{
            //System.out.println("Minor");
            return "Minor";
          }

}  

      public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter your age : ");
      int age = sc.nextInt();
      
      System.out.println("Your are "+AgeChecker(age));
      
}

}


//Output:

//C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_3>javac Age.java

//C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_3>java Age
//Enter your age :
//15
//Your are Minor