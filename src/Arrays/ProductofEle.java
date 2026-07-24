package Arrays;

public class ProductofEle {
    static void main() {
        int[] arr = {12,23,34,45,56,67,78,90};
        long product = 1;
        for(int i = 0;i<arr.length;i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
