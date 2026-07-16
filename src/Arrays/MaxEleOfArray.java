package Arrays;

public class MaxEleOfArray {
    static void main() {
        int[] arr = {12,23,34,45,56,667,788};
        int max_ele = arr[0];
        for (int i=1;i<arr.length;i++){
            if ((arr[i]) > max_ele) {
                max_ele = arr[i];
            }else {
//                max_ele =arr[0] ;
            }
        }
        System.out.println(max_ele);
    }
}
