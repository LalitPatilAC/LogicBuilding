//Problem 6: Calculate the Sum of Numbers from 1 to N (Using for Loop)

//Problem Statement:
//Write a Java program that calculates the sum of all integers from 1 to N (where N is a //positive integer) using a for loop. The program should:
//1. Create a method calculateSum() that takes a number N and calculates the sum of all //integers from 1 to N.
//2. Use a for loop to iterate through all integers from 1 to N and add them up.


class SumOfN{

   public static void CalculateSum(int num){
   int sum = 0;
   for(int i = 0;i<=num;i++){
       sum = sum+i;
}

     System.out.println("Sum Of 1 to 5 is "+sum);
   
}
   
   public static void main(String args[]){

     CalculateSum(5);

}

}