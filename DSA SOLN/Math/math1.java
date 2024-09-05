//Que 1:- Sum of PrimeNumbers.
package Math;
public class math1{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int nums : arr){
            if (sumofprimtnumbers(nums)) {
                sum += nums;
            }
        }
        System.out.println(sum);
    }

    public static boolean sumofprimtnumbers(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

}