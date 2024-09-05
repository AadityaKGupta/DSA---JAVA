//Que :- find the maximum occurrence of the element in the array. 

package array;

import java.util.Arrays;

public class array9 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,2,2,3,3,3,3,4,45,5,5,5,5,5,5,5,5};
        System.out.println(maxoccurence(arr));
    }

    public static int maxoccurence(int[] arr){
        Arrays.sort(arr);

        int count = 0;
        int maxcount = 0;
        int max= arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }

            else{
                if(count > maxcount){
                    maxcount = count;
                    max = arr[i-1];
                }
                count = 1;
            }
        }
        if(count > maxcount){
            max = arr[arr.length - 1];
        }
        return max;
    }
}
