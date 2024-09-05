//Que :- Reverse the array.

package array;

public class array3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] reverse = reversearray(arr);

        for(int i: reverse){
            System.out.print(i + " ");  // Output: 9 8 7 6 5 4 3 2 1  // Array reversed in place using a temporary array.
        }

    }   
    
    public static int[] reversearray(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];

        for(int i=0; i<n;i++){
            temp[i] = arr[n-i-1];
        }
        return temp;  // Return the reversed array.
    }
}

