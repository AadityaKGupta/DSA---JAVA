//leetcode:- 1768. Merge Strings Alternately.

// Que 1 :- You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
           //Return the merged string.
package String;
public class string8{
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(alternatestring(word1,word2));
    }

    public static String alternatestring(String word1, String word2){

        //sb: A StringBuilder object that is used to efficiently build a new string by appending characters to it.
        StringBuilder sb = new StringBuilder();
        
        int n = word1.length();
        int m = word2.length();

        int max = Math.max(n, m);
        for(int i = 0; i<max; i++){
            if(i<n){
                sb.append(word1.charAt(i));
            }
            if (i<m) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}