//Que 25:- replace the char ch1 with char ch2 and char ch2 with char ch1.

package String;
public class String10 {
    public static void main(String[] args) {
        String s = "apples";
        char ch1 = 'a';
        char ch2 = 'p';
        System.out.println(replace(s, ch1, ch2));  // Output: paales
    }

    public static String replace(String s, char ch1, char ch2){
        char[] c = s.toCharArray();

        for(int i = 0; i<s.length(); i++){
            if(c[i] == ch1){
                c[i] = ch2;
            }

            else if(c[i] == ch2){
                c[i] = ch1;
            }
        }
        return new String(c);
    }
}