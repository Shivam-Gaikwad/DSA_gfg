package Basics;

public class ArithematicOperationsOnInt {
    static void main() {
        double x = 5;
        double y = 2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y); // if data type int used then output will be 2 as an int/int = int
        // use double for decimal in float cant save bigger values


        // modulud operator = %

        // a % b this will return the remainder of the division
        // 5%2 = 1

        System.out.println(5%2);

        // properties of modulus operator:

        /*
        a%b = a if a<b   2%4 = 2
        a%(-b) = a%b
        -a % b = - a%b answer will be minus
        */



    }
}
