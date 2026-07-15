package Functions;

import java.util.Scanner;

public class BuiltIn {
    static void main() {

        // Math. wale functions

        double x = Math.sqrt(4);
        System.out.println(x);

        double x1 = Math.cbrt(100);
        System.out.println(x1);

        System.out.println(Math.abs(-3456));
        System.out.println(Math.floor(-7.6));  //-7
        System.out.println(Math.ceil(3.0002));  //4
        System.out.println(Math.min(23,56));
        System.out.println(Math.max(23,56));

        // Max of three builtin
        int a =10 ,b=46,c=67;
        System.out.println(Math.max(Math.max(a,b),c));

        // max of 4 numbers

        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println(Math.max(Math.max(Math.max(num1,num2),num3),num4));



    }
}
