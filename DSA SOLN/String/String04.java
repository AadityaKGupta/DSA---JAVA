//Que :- check whether the String is palindrome or not.

package String;

public class String04 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(ispalindrome(s)); // true
    }

    public static boolean ispalindrome(String s){
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
