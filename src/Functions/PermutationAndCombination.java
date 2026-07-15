package Functions;

import java.util.Scanner;

public class PermutationAndCombination {
    static int fact(int n){
        int f = 1;
        for (int i =1;i<=n;i++){
            f *= i;
        }
        return f;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int nFact = fact(n)/(fact(r)*fact(n-r));
        System.out.println(nFact);
    }
}
