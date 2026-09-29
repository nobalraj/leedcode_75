package interview_75_DSA;

import java.awt.*;

public class gcdOfStrings {
    public static   String gcdOfStringss(String str1, String str2) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<str1.length()-1;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                str.append(str1.charAt(i));
            }
            return str.toString();


        }
        return new String(" ");



    }
    public static void main(String[] arg){
        String word1="ABCD",word2="ABC";
        StringBuilder str=new StringBuilder();
        System.out.println(gcdOfStringss(word1,word2));



//        for(int i=0;i<word1.length()-1;i++){
//            if (word1.charAt(i)==word2.charAt(i)){
//                str.append(word1.charAt(i));
//            }
//        }
//
//        System.out.println(str);
    }
}
