//Que 21:- fabonacci number.
package Math;
public class math3 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(fabonacci(n));
    }

    public static int fabonacci(int n){
        if(n==0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return fabonacci(n-1) + fabonacci(n-2);
    }
}
