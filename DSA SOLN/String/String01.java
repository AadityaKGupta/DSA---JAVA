//Que :- Reverse a String.

package String;

public class String01 {
    public static void main(String[] args) {
        String s = "heelo world";
        System.out.println(reverse(s));  // olleh dlrow
    }

    public static String reverse(String s){
        char[] c = s.toCharArray();

        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int left = 0;
        int right = c.length - 1;

        while (left < right) {
            while(left<right && characters.indexOf(c[left]) == -1){
                left++;
            }
            while(left< right && characters.indexOf(c[right]) == -1){
                right--;
            }

            if (left<right) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        return new String(c);
    }
}
