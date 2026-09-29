package interview_75_DSA;

public class Merge_String_Alternatiely {
    public static void main(String[] args){
//        String word1="abc";
//        String word2="pqr";
        String word1="ab";
        String word2="pqrs";

        StringBuilder str=new StringBuilder();
        int len=Math.max(word1.length(),word2.length());
//        System.out.println(len);
        int j=0;
        int k=0;
        for (int i=0;i<len;i++){
            if (j<word1.length()){
                str.append(word1.charAt(j));
                j++;

            }
            if (k<word2.length()) {
                str.append(word2.charAt(k));
                k++;

            }



        }
        System.out.println(str);

//        System.out.println(word1.charAt(0));
    }
}
