package Arrays;

public class SingleNumber {

    public static int findSingleNumber(int[] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        System.out.println("Single Number: " + findSingleNumber(arr));
    }
}
