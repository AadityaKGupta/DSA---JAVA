//Que 3:- reverse a number.
package Math;
public class math5 {
    public static void main(String[] args) {
        int num = 12345;
        int reverseNum = reverse(num);
        System.out.println("Reverse of " + num + " is: " + reverseNum);
    }

    public static int reverse(int num){
        int reverse = 0;
        int digit = num;
        while(num != 0){
            digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        return reverse;
    }
}
