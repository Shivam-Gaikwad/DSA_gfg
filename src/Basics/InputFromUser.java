package Basics;

import java.util.Scanner;

public class InputFromUser {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r= sc.nextDouble();
        double area = 3.14 * r*r;
        System.out.println(area);


        // sum of two numbers defined by user

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println(num1 + num2);

    }
}




