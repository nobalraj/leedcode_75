package interview_75_DSA.Week_2_21_09_26;

import java.util.Arrays;

class String_Compression_443{
    public static int compress(char[] chars) {
        int left=0;
        int right=0;


        while(right<chars.length){
            char currentchar=chars[right];
            int count=0;

            while(right<chars.length && chars[right]==currentchar){
                right++;
                count++;
            }
            chars[left++]=currentchar;

            if(count>1){
                for(char c:String.valueOf(count).toCharArray()){
                    chars[left++]=c;
                }
            }

        }
        return left;

    }
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        // 1. Get the return length (this is what your method returns: 6)
        int newLength = compress(chars);
        System.out.println("Returned Length: " + newLength);

        // 2. Visualise the modified array up to the returned length
        char[] finalResult = Arrays.copyOf(chars, newLength);
        System.out.println("Visual Output: " + Arrays.toString(finalResult));


    }

}