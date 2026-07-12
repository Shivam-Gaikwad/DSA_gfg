package Loops;

import java.util.Scanner;

public class ForLoop {
//Print numbers from 1 to 10 .
static void main() {
//    int i = 0;
    for (int i=1;i<=10;i++){
        System.out.println(i);
    }

    //Print _________ ‘n’ times. Take ‘n’ input from user

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i =1; i<=n; i++ ){
        System.out.println("yashika");
    }

    // Print the table of 19

    for (int i=19 ;i<=190; i = i+19){
        System.out.println(i);
    }

    //Display this AP - 2,5,8,11.. upto ‘n’ terms
}
}
