//Que 23:- check whether the given number is leap year or not. 
package Math;
public class math2 {
    public static void main(String[] args) {
        int num = 100;
        if(leapyear(num)){
            System.out.println(num + " is a leap year.");
        } else {
            System.out.println(num + " is not a leap year.");
        }
    }

    public static boolean leapyear(int num){
        if(num % 4 == 0 && num % 100 != 0 || num % 400 == 0){
            return true;
        }
        return false;
    }
}
