package If_Else;
import java.util.Scanner;
public class OddEven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if(num%2 == 0 )System.out.println("Number is even");   // if wanted to write the single line then can follow the given method but if have to print the more lines then use the brackets.
        else System.out.println("Number is odd");


        // Take en integer input and print the absolute value of that integer

        double num1 = sc.nextDouble();
        if(num1 >= 0) System.out.println(num1);
        else System.out.println(-1*num1);
        // or  using only if
        if(num1 < 0) num1 = -num1 ;
        System.out.println(num1);

        // profit and loss

        double cp = sc.nextDouble();
        double sp = sc.nextDouble();
        if(cp > sp){
            System.out.println("You are in loss of " + (cp-sp));
        }else {
            System.out.println("You are in profit: " + (sp - cp));

        }
        // if_else / else_if ladder:

//            Take length and breadth of
//            rectangle as input and write a program
//            to find whether the area of rectangle is
//            greater than its perimeter.
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double area = length * breadth;
        double perimeter = 2*length + 2*breadth;

        if (area>perimeter) System.out.println("Area of reactange is greater than perimeter");
        else if(perimeter>area) System.out.println("Perimeter is greater than Area");
        else if(area == perimeter) System.out.println("Both are same");
        else System.out.println("Ab kya print karu bhaii");

        // Take positive integer input and
        //tell if it is a four digit number or not.

        double ineGer = sc.nextDouble();
        if(ineGer > 999 && ineGer<10000) System.out.println("The number has an 4 digits");
        else System.out.println("Number contains either less or more digits than the 4 digits");
// Ternary operator

        int a = 12 , b =45, c =46;
        int greatest =
                 (a>b) ?((a>c)? a:c) :((b>a)? b:c);
    }
}

