package Arrays;

public class SumofElements {
    static void main() {
        int[] arr = {12,23,34,45,56,67,78,90};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
