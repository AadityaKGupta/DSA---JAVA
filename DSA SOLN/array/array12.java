//Que :- Search in sorted Array.

package array;

public class array12 {
    public static void main(String[] args){
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 8;
        int result = search(arr, target);
        System.out.println("Element found at index: " + result);
    }

    public static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;

        while (left <= right) {
            int mid = left + (right-left) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[left] <= arr[mid]){
                if(target >= arr[left] && target < arr[mid]){
                    right = mid -1;
                } else{
                    left = mid+1;
                }
            } else{
                if(target <= arr[right] && target > arr[mid]){
                    right = right -1;
                }
                else{
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}
