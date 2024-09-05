//Que :- find the k largest element in the array.

package array;

import java.util.Arrays;

public class array07 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(klargest(arr, k));
    }

    public static int klargest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
}
