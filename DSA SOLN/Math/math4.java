//Que :- Checks whether the given number is prime number.
package Math;
public class math4 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for(int num : arr){
            if(primenumber(num)){
                System.out.print(num + " ");
            }
        }
        
    }

    public static boolean primenumber(int num){
        if (num <=1) {
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
