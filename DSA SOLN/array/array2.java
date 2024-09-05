//Que :- find the peak element.

package array;

public class array2 {
    public static void main(String[] args) {
        int[] arr = {1,2,231,2121,123};
        System.out.println(peakelement(arr));
    }

    public static int peakelement(int[] arr){
        if(arr.length == 0){
            return 0;
        }

        if(arr.length == 1){
            return 0;
        }

        if(arr[0] > arr[1]){
            return 0;
        }

        if (arr[arr.length-1] > arr[arr.length-1]) {
            return arr.length-1;
        }

        for(int i=1;i<arr.length; i++){
            if(arr[i]>arr[i+1] && arr[i] > arr[i-1]){
                return i;
            }
        }
        return 0;
    }
}
