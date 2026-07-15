package Functions;

public class ReturnType {

    // return value

    static int saii(char initial){
        System.out.println("Hello " + initial);
        return 5;
    }
    static int saiicharan(int a , int b){
        System.out.println("Hello " + (a+b));
        if (a == 4)return 5;
        else return 6;
    }

    static void main() {
        saii('s');
        saiicharan(12,45);
        System.out.println(saiicharan(12,34));
        System.out.println(saii('s'));  // when we print like this it will give the 5 also in output
    }
}

