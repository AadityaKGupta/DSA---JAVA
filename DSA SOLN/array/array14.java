//Que :- remove duplicate number and print the number only once times.

package array;

public class array14 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,7};
        int[] result = removedup(arr);

        for(int i : result){
            System.out.println( i + " ");
        }
    }

    public static int[] removedup(int[] arr){
        int n = arr.length;
        int count = 0;

        for(int i=0; i<n-1 ;i++){
            if (arr[i] != arr[i+1]) {
                arr[count] = arr[i];
                count++;
            }
        }
        arr[count] = arr[n-1];
        count++;
        int[] result = new int[count];
        for(int i=0;i<count;i++){
            result[i] = arr[i];
        }
        return result;
    }
}
