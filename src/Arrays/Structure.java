package Arrays;
import java.util.Arrays;

public class Structure {
    static void main() {
        int[] arr = {6,19,7,69,9,171,5};
        for (int i =0 ; i< arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        //Indexing
        System.out.println(arr[3]);

        //updating array

        arr[4] = 45;
        System.out.println(arr[4]);

        int[] arr1 = new int[6];

        arr1[1] = 31;
        arr1[2] = 32;
        arr1[3] = 33;
        arr1[4] = 34;
        arr1[0] = 35;
        System.out.println(arr1[4]);

        System.out.println(Arrays.toString(arr1));
    }

}
