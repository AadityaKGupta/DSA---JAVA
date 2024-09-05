//Que 16:- find the difference between the sum of square root of array of even and odd numbers.
package array;
public class array16 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Difference: " + difference(arr));
    }

    public static double difference(int[] arr){
        double evensum = 0;
        double oddsum = 0;

        for(int i = 1; i<arr.length; i++){
            if(arr[i]%2==0){
                evensum += Math.sqrt(arr[i]);
            }

            else{
                oddsum += Math.sqrt(arr[i]);
            }
        }
        return (double) evensum - oddsum ; 
    }
}