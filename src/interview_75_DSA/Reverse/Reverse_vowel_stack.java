package interview_75_DSA.Reverse;

import java.util.Stack;

public class Reverse_vowel_stack {
    static boolean isVowel(char c){
        char vowel=Character.toLowerCase(c);
        return vowel=='a' || vowel=='e' || vowel=='i' || vowel=='o' || vowel=='u';
    }
    public static String reverseVowel(String s){
        char[] ch=s.toCharArray();
        Stack<Character>stack=new Stack<>();
        for (char c:ch){
            if (isVowel(c)){
                stack.push(c);
            }
        }
        for (int i=0;i<ch.length;i++){
            if (isVowel(ch[i])){
                ch[i]= stack.pop();
            }
        }
        return new String(ch);
    }


    public static  void main(String[] args){
        String str="IcecreAm";
        System.out.println(reverseVowel(str));


    }
}
