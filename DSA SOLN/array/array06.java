//Que:- Find the ksmallest element in the array.

package array;

import java.util.Arrays;

public class array06 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15}; 
        int k = 4;
        System.out.println("Kth smallest element is: " + ksmallest(arr, k));  // Output: 10
    }

    public static int ksmallest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}
