//Que :- check wheather the given array contains duplicate or not.

package array;

import java.util.Arrays;

class array11 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(containsduplicate(arr));
    }

    public static boolean containsduplicate(int[] arr ){
        Arrays.sort(arr);
        for(int i=1;i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                return true;
            }
        }
        return false;
    }
}