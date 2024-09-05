//Que :- Sort the array. 

package array;

import java.util.Arrays;

public class array04 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,7,43,6,8,9,5,43,2};
        int[] sorted = sort(arr);

        for(int i : sorted){
            System.out.print(i + " ");
        }
    }

    public static int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
