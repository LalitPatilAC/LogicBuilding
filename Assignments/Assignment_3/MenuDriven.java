//Bonus Problem: 
//Menu-Driven Java Program (Switch-Case) 

//The four problems are as follows (Already done in assignment 2, just put it in switch //case): 
//Problem 1: Grade Evaluation System 
//Problem 2: Leap Year Check 
//Problem 3: Day of the week 
//Problem 4: Identify Default Values of Variables 
//Case 5: Exit 


import java.util.Scanner;

public class MenuDriven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Grade Evaluation System");

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    if (marks >= 90) {
                        System.out.println("Grade: A");
                    } else if (marks >= 75) {
                        System.out.println("Grade: B");
                    } else if (marks >= 60) {
                        System.out.println("Grade: C");
                    } else if (marks >= 40) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Grade: F");
                    }

                    break;

                case 2:
                    System.out.println("Leap Year Check");

                    System.out.print("Enter year: ");
                    int year = sc.nextInt();

                    if ((year % 400 == 0) ||
                        (year % 4 == 0 && year % 100 != 0)) {

                        System.out.println(year + " is a Leap Year");

                    } else {

                        System.out.println(year + " is not a Leap Year");
                    }

                    break;

                case 3:
                    System.out.println("Day of the Week");

                    System.out.print("Enter day number (1-7): ");
                    int day = sc.nextInt();

                    switch (day) {

                        case 1:
                            System.out.println("Monday");
                            break;

                        case 2:
                            System.out.println("Tuesday");
                            break;

                        case 3:
                            System.out.println("Wednesday");
                            break;

                        case 4:
                            System.out.println("Thursday");
                            break;

                        case 5:
                            System.out.println("Friday");
                            break;

                        case 6:
                            System.out.println("Saturday");
                            break;

                        case 7:
                            System.out.println("Sunday");
                            break;

                        default:
                            System.out.println("Invalid day number");
                    }

                    break;

                case 4:
                    System.out.println("Default Values of Variables");

                    int intValue = 0;
                    double doubleValue = 0.0;
                    float floatValue = 0.0f;
                    char charValue = '\u0000';
                    boolean booleanValue = false;

                    System.out.println("int default value     : " + intValue);
                    System.out.println("double default value  : " + doubleValue);
                    System.out.println("float default value   : " + floatValue);
                    System.out.println("char default value    : " + charValue);
                    System.out.println("boolean default value : " + booleanValue);

                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1-5.");
            }

        } while (choice != 5);

        sc.close();
    }
}



//Output:

C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_3>javac MenuDriven.java

C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_3>java MenuDriven

===== MENU =====
1. Grade Evaluation System
2. Leap Year Check
3. Day of the Week
4. Identify Default Values of Variables
5. Exit
Enter your choice: 2
Leap Year Check
Enter year: 2004
2004 is a Leap Year

===== MENU =====
1. Grade Evaluation System
2. Leap Year Check
3. Day of the Week
4. Identify Default Values of Variables
5. Exit
Enter your choice: 1
Grade Evaluation System
Enter marks: 60
Grade: C

===== MENU =====
1. Grade Evaluation System
2. Leap Year Check
3. Day of the Week
4. Identify Default Values of Variables
5. Exit
Enter your choice: 3
Day of the Week
Enter day number (1-7): 3
Wednesday

===== MENU =====
1. Grade Evaluation System
2. Leap Year Check
3. Day of the Week
4. Identify Default Values of Variables
5. Exit
Enter your choice: 4
Default Values of Variables
int default value     : 0
double default value  : 0.0
float default value   : 0.0
char default value    :
boolean default value : false

===== MENU =====
1. Grade Evaluation System
2. Leap Year Check
3. Day of the Week
4. Identify Default Values of Variables
5. Exit
Enter your choice: 5
Exiting program...