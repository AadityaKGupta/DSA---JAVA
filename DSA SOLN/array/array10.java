//Que :- Count the number of pairs in the array that is equal to k.

package array;

public class array10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 8;
        System.out.println(countpairs(arr, k));
    }

    public static int countpairs(int[] arr ,int k){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == k){
                    count++;
                }
            }
        }
        return count;
    }
}