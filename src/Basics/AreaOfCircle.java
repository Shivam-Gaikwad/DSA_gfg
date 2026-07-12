package Basics;

//import java.util.Scanner;

/* Variables can start with alphabet or _ or $
  special characters only _ and $ are allowed others are not alloweded
  Blanks , commas are not allowed
  reserved keywords are not allowed
 */

public class AreaOfCircle {
    static void main() {
        double r = 5;
        double pi = 3.141592;
        System.out.println(r*r*pi);   // decimal * int = decimal

// Volume of sphere  4/3*pi*r**3
        double sp = 4/3;
        System.out.println(sp*pi*r*r*r);

//calculate total surface area of cubiod  2 (lw + wh + lh)

        double l = 10 , w = 20, h = 30;
        System.out.println(2*(l*w+ w*h + l*h));
    }
}