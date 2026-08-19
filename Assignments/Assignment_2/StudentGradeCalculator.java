//Problem 1: Grade Evaluation System 

//Problem 1: Grade Evaluation System Problem Statement: Write a Java program that calculates //the average marks of a student and determines the grade based on the following criteria: 

public class StudentGradeCalculator {
    public static void main(String[] args) {
        
        double mathMarks = 80;
        double scienceMarks = 85;
        double historyMarks = 90;

        double averageMarks = (mathMarks + scienceMarks + historyMarks) / 3.0;
        String grade;
        if (averageMarks >= 90) {
            grade = "A";
        } else if (averageMarks >= 70) {
            grade = "B";
        } else if (averageMarks >= 50) {
            grade = "C";
        } else if (averageMarks >= 30) {
            grade = "D";
        } else {
            grade = "Fail";
        }


        System.out.println("Average Marks: " + (int) averageMarks);
        System.out.println("Grade: " + grade);
    }
}


//Output:

Microsoft Windows [Version 10.0.26200.9168]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_2>javac StudentGradeCalculator.java

C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_2>java StudentGradeCalculator
Average Marks: 85
Grade: B