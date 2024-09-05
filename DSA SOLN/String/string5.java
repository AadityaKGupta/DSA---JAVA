//leetcode:-28. Find the Index of the First Occurrence in a String.

//Que:- Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
package String;
public class string5 {
    public static void main(String[] args) {
        String heystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strstr(heystack, needle));
    }

    public static int strstr(String heystack , String needle){
        for(int i=0; i<heystack.length()-needle.length()+1; i++){
            if(heystack.charAt(i) == needle.charAt(0)){
                if(heystack.substring(i, needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
