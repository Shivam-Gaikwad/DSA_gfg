package Arrays;
// Multiply odd indexed elements by 2
// and add 10 to even indexed elements
public class HW {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += 10;
            } else {
                arr[i] *= 2;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}