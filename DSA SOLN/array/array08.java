//Que :- find the occurence of the target element in the array.

package array;

public class array08 {
    public static void main(String[] args) {
        int[] arr = {1,23,234,43,23,6,67,4,5,5,5,5,5};
        int target = 5;
        System.out.println(occurence(arr, target));
    }

    public static int occurence(int[] arr , int target){
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
