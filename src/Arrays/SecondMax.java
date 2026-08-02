package Arrays;
//Print the second Maximum
//element in the array
public class SecondMax {

    public static void main(String[] args) {

        int[] arr = {12, 45, 67, 23, 89, 54, 89, 78};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second maximum element does not exist.");
        } else {
            System.out.println("Second Maximum Element = " + secondMax);
        }
    }
}
