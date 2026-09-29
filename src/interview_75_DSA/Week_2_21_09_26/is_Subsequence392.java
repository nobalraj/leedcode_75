package interview_75_DSA.Week_2_21_09_26;

public class is_Subsequence392 {
//    public boolean isSubsequence(String s, String t) {
//        if (s == null || t == null || s.length() == 0)
//            return false;
//
//    }

    public static void main(String[] args) {
        String str = "abc";
        String t="ahbgdck";
        String val="";
        int left=0;
        int right=0;
        boolean flag=false;

        while (left< str.length()&&right<t.length()){
            if (str.charAt(left)==t.charAt(right)){
                left++;


            }
                right++;




        }
        if (left ==str.length()){
            System.out.println(true);
        }

        System.out.println(val);


    }
}
