package Patterns;

public class Triangles {
    static void main(){

        // right angled triangles

        for (int i=1; i<=4; i++){
            for ( int j = 1; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1; i<=4; i++){
            for ( int j = 1; j <= i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i=1; i<=4; i++){
            for ( int j = 1; j <= i ; j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
//        1
//        AB
//        123
//        ABCD
        for (int i=1; i<=4; i++){
            for ( int j = 1; j <= i ; j++){
                if (i%2==0){
                    System.out.print((char)(j+64));
                }else System.out.print(j);

            }
            System.out.println();
        }
        for (int i=5; i>=1; i--){
            for ( int j = 1; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=5; i>=1; i--){
            for ( int j = 1; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i=5; i>=1; i--){
            for ( int j = 1; j <= i ; j++){
                System.out.print((char)(j+96));
            }
            System.out.println();
        }

        // Right angled triangle with numbers
        for(int i=1; i<=4;i++){
            for (int j =1; j<=i; j++){
               if(i == 1) System.out.print(j +" ");
               else if(i==2) System.out.print((j+1)+" ");
               else if(i==3) System.out.print((j+3)+" ");
               else if (i==4) System.out.print((j+6)+" ");
            }
            System.out.println();
        }
        // cross

        for (int i=0;i<=5;i++){
            for (int j=0;j<=5;j++){
                if(i==j || i+j == 6)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j*2-1 +" ");
            }
            System.out.println();
        }
        // binary triangle

        for (int i=1;i<=5;i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2 == 0) System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }

        for (int i=1;i<=4;i++){
            for(int j = 1; j<=4; j++){
                if(i+j>4) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=1;i<=4;i++){
            for(int j = 1; j<=4; j++){
                if(i+j>4){
                    if(i == 1){
                        System.out.print("A");
                    } else if ( i == 2) {
                        System.out.print("B");
                    } else if (i == 3) {
                        System.out.print("C");
                    } else if (i == 4) {
                        System.out.print("D");
                    }
            } else System.out.print(" ");
            }
            System.out.println();
        }


    }
}
