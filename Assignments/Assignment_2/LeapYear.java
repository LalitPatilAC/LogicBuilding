//Problem 2: Leap Year 
//Problem Statement: Write a Java program that checks whether the year is a leap year or not. A year is a leap year if: It is divisible by //4, but not divisible by 100, or It is divisible by 400. 

public class LeapYear {
    public static void main(String[] args) {
        int year1 = 2024;
        checkLeapYear(year1);

        int year2 = 1900;
        checkLeapYear(year2);
    }

    public static void checkLeapYear(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}


//output : 

C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_2>javac LeapYear.java

C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_2>java LeapYear
2024 is a leap year.
1900 is not a leap year.

C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_2>