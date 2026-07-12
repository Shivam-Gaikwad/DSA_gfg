package Basics;

public class DivisionOfDataTypes {
    static void main() {
        /*

Type Promotion Order:
byte → short → int → long → float → double

Result Type Matrix

             byte   short   int    long   float   double
---------------------------------------------------------
byte          int     int     int    long   float   double
short         int     int     int    long   float   double
int           int     int     int    long   float   double
long          long    long    long   long   float   double
float         float   float   float  float  float   double
double        double  double  double double double  double

Rules:
1. Both operands are integers (byte, short, int, long) → Integer Division
   Example: 5 / 2 = 2

2. If one operand is long and the other is an integer → Result is long
   Example: 5L / 2 = 2L

3. If one operand is float → Result is float
   Example: 5 / 2f = 2.5f

4. If one operand is double → Result is double
   Example: 5 / 2.0 = 2.5

5. Integer division removes the decimal part.
   Example: 9 / 4 = 2

6. Division by zero:
   int:    5 / 0    → ArithmeticException
   double: 5.0 / 0  → Infinity
           -5.0 / 0 → -Infinity
           0.0 / 0  → NaN
         */


        // char data type

        char name= 's';
        char adi = 'R';
        char name3 = '5';
        char adi2 = '#';



        // ASCII Values
        /*
        a to z =  97 to 122
        A to Z =  65 to 90
        0 to 7 =  48 to 57
          */

        // typecasting : changing from one data type to another . there are mainly two types of type casting impicit and explicit type casting
        char pritam = 'a';
        int y = (int)pritam;
        System.out.println(y);  // explicit typecasting

        // also can print the ascii values of the data types and variables
        char ch = 'A';
        int x = ch;
        System.out.println(x); // implicit typecasting

        char harsh = '3';
        System.out.println((int)harsh);

        // interger to character

        int s = 39;
        char ch2 = (char)x;
        System.out.println("hello"+ ch2);
    }
}
