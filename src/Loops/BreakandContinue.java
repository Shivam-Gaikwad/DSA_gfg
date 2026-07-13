package Loops;

public class BreakandContinue {
    static void main() {
        for (int i = 0 ; i<=50; i++){
            if (i==5 || i == 10 || i == 15 || i == 20 || i == 25){
                continue;
            }
            System.out.println(i);

        }
        for (int i = 0 ; i<=510; i++){
            if (i==5){
                break;
            }
            System.out.println(i);

        }

        // while loop
        int n = 5;
        while(n<=8){
            System.out.println(n);
            n++;
        }

        // do while in java

        int i = 1;
        do {
            System.out.println("Om Saii");
            i++;
        } while (i <= 5);

        // infinnite loop
        /*
        for(i = 1 ; i <= 10 ; i--) System.out.println(i);
        this is the infinite loop
         */

        // sum of all digits of number

        int num = 1234;
        int sum = 0;

        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}
