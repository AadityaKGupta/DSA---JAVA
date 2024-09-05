//Que :- Minimum Size Subarray Sum.

package array;

public class array15 {

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(subarraysum(arr , target));
    }

    public static int subarraysum(int[] arr , int target){
        int left = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            while (sum>=target) {
                int curr = i-left+1;
                min = Math.min(min, curr);
                sum -=arr[left];
                left++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}