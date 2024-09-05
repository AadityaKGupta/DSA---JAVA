//leetcode:-459. Repeated Substring Pattern.

//Que :- Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
package String;

public class string6 {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(resubString(s));
    }

    public static boolean resubString(String s){
        String doubled = s+s;

        String modified = doubled.substring(1, doubled.length()-1);
        return modified.contains(s);
    }
}

//output :- true