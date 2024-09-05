package array;

public class array13 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(buyandsell(arr));
    }

    public static int buyandsell(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i] - min);
        }
        return max;
    }
}
