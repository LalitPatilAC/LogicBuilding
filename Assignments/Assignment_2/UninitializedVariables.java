//Problem 4: Identify the Values of Uninitialized Variables Scenario: 
//You are working on a program that handles different data types. Your manager has asked you to quickly check the values of various //variables, but you’re in a rush and forget to initialize them. As you go through the code, you expect some values to show up, but Java //has something else in mind. Your task is to fix the issue and ensure the variables hold proper values. 

public class UninitializedVariables {

    static byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;

    public static void main(String[] args) {
        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g); 
        System.out.println("boolean: " + h);
    }
}


//Output :

C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_2>javac UninitializedVariables.java

C:\Users\Lalit Patil\OneDrive\Desktop\Assignment_2>java UninitializedVariables
byte: 0
short: 0
int: 0
long: 0
float: 0.0
double: 0.0
char:
boolean: false

