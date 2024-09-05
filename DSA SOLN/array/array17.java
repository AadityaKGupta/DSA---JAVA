//Que 18:- Find the target element in the 2d array. 
package array;
public class array17 {
    public static void main(String[] args) {
        int[][] arr = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };
        int target = 3;
        System.out.println(targetelement(arr, target));
    }

    public static boolean targetelement(int[][] arr, int target){
        for(int[] num : arr){
            int left = 0, right = arr.length-1;

            while(left <= right){
                int mid = left + (right - left) / 2;
                if(num[mid] == target){
                    return true;
                }
                else if(num[mid] < target){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return false;
    }
}
