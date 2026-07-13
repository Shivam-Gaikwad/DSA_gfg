package Patterns;

import java.util.Scanner;

public class Rectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int column = sc.nextInt();
//        for (int i=1;i<=row;i++){
//            for (int j =1; j<=column;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        int row1 = sc.nextInt();
//        int column1 = sc.nextInt();
//        for (int i=1;i<=row1;i++){
//            for (int j =1; j<=column1;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        int row2 = sc.nextInt();
//        int column2 = sc.nextInt();
//        for (int i=1;i<=row2;i++){
//            for (int j =1; j<=column2;j++){
//                System.out.print((char)(j+64));
//            }
//            System.out.println();
//        }
//        int row3 = sc.nextInt();
//        int column3 = sc.nextInt();
//        for (int i=1;i<=row3;i++) {
//            for (int j = 1; j <= column3; j++) {
//                System.out.print((char) (j + 96));
//            }
//            System.out.println();
//        }
//        int row4 = sc.nextInt();
//        int column4 = sc.nextInt();
//        for (int i=1;i<=row4;i++){
//            for (int j =1; j<=column4;j++){
//                System.out.print((char)(i+64));
//            }
//            System.out.println();
//        }
//        int row5 = sc.nextInt();
//        int column5 = sc.nextInt();
//        for (int i=1;i<=row5;i++) {
//            for (int j = 1; j <= column5; j++) {
//                System.out.print((char) (i + 96));
//            }
//            System.out.println();
//        }
        // Rectangle with different outer and inner symbols
        // holllow rectangle
        for (int i= 1; i<=5 ;i++){
            for (int j=1; j<=7; j++){
                if(i==1 || i == 5 || j ==1 || j ==7){
                    System.out.print("* ");
                }else System.out.print("  ");  // in above statement the "* " takes the space of two characters so we have to put the double tab space here so rectangle can stay aligned
            }
            System.out.println();
        }

        // plus

        for (int i=1;i<=5;i++){
            for (int j =1;j<=5;j++){
                if(i==3 || j == 3) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }

        // or


        int n = sc.nextInt();
        int mid;
        if (n %2 != 0)mid = (n/2) +1 ;
        else mid = n/2 ;
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j<=n ;j++) {
               if(i == mid || j == mid){
                   System.out.print("* ");
               }else System.out.print("  ");
           }
            System.out.println();

        }

    }
}
