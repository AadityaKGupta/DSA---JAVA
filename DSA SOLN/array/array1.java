//Que :- find the maximum and minimum number of elements.

package array;

public class array1 {
    public static void main(String[] args) {
        int[] arr = {1, 22, 3, 4, 5, 6, 7, 9};
        minandmax(arr);
    }

    public static void minandmax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                max = Math.max(max, arr[i]);
            } else if (arr[i] < arr[i - 1]) {
                min = Math.min(min, arr[i]);
            }
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
