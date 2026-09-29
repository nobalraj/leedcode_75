package interview_75_DSA.Reverse;

public class Reverse_Vowels {
    static boolean isVowel(char c){
        char vowel=Character.toLowerCase(c);
        return vowel=='a' || vowel=='e' || vowel=='i' || vowel=='o' || vowel=='u';
    }

    static String reverse_Vowel(String s){
        char[] ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left <right){
            if (!isVowel(ch[left])){
                left++;
            } else if (!isVowel(ch[right])) {
                right--;

            }else {
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;

            }
        }
        return new String(ch);

    }

    public static void main(String[] args){
        String str="IceCreAm";
        String output=reverse_Vowel(str);
        System.out.println(output);

    }
}
