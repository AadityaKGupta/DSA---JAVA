//Que :- Subarray sum.

package array;

public class array5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 15;
        System.out.println(subarraysum(arr, target));
    }

    public static int subarraysum(int[] arr , int target){
        int count = 0;
        for(int start = 0; start<arr.length; start++){
            int currentsum = 0; 
            for(int end = start; end<arr.length; end++){
                currentsum+=arr[end++];

                if (currentsum == target) {
                    count++;
                }
            }
        }
        return count;
    }
}