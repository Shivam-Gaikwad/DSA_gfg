package Arrays;

public class MinEleOfArray {
    static void main() {
        int[] arr = {12, 23, 34, 45, 5, 667, 788};

        int min_ele = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min_ele > arr[i]) {
                min_ele = arr[i];
            }
        }

        System.out.println(min_ele);
    }
}