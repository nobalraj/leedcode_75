package DSA.Extra_Practise_problems;

import java.util.Arrays;

public class Reverase_Word {
    static String reverseWord(String str){
        String[] arr= str.split("\\s+");
        System.out.println(Arrays.toString(arr));
        StringBuilder s=new StringBuilder();
        for (int i=arr.length-1;i>=0;i--){
            s.append(arr[i]);
            if (i !=0){
                s.append(" ");
            }
        }
        return s.toString().trim();
    }
    public static void main(String[] args){
        String str="the sky is blue";
        System.out.println(reverseWord(str));

    }
}
