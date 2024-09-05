//Que 12:- change the char a with b and b with a in the given string.
package String;
public class String09 {
    public static void main(String[] args) {
        String s = "aabbaa";
        System.out.println(replace(s));  // Output: bbaabb
    }

    public static String replace(String s){
        char[] c = s.toCharArray();

        for(int i = 0; i<c.length; i++){
            if(c[i] == 'a'){
                c[i]='b';
            }
            else if(c[i]=='b'){
                c[i] = 'a';
            }
        }
        return new String(c);
    }
}
