//Problem 3: Days of the Week Problem Statement: 
//Write a Java program that takes an integer between 1 and 7 and prints the corresponding day of the week using a switch-case statement. //If the input is outside the range of 1 to 7, the program should display "Invalid day number". Predefined Value: Day number = 3 Expected //Output: The day is Wednesday. 

public class DaysOfWeek {
    public static void main(String[] args) {
        int dayNumber = 3; 

        switch (dayNumber) {
            case 1:
                System.out.println("The day is Monday.");
                break;
            case 2:
                System.out.println("The day is Tuesday.");
                break;
            case 3:
                System.out.println("The day is Wednesday.");
                break;
            case 4:
                System.out.println("The day is Thursday.");
                break;
            case 5:
                System.out.println("The day is Friday.");
                break;
            case 6:
                System.out.println("The day is Saturday.");
                break;
            case 7:
                System.out.println("The day is Sunday.");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
    }
}


//Output :

C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_2>javac DaysOfWeek.java

C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_2>java DaysOfWeek
The day is Wednesday.
