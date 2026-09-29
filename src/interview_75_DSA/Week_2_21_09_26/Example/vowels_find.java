package interview_75_DSA.Week_2_21_09_26.Example;

public class vowels_find {
    static int vowels_check(String str){
        int count=0;
        boolean[] visited=new boolean[5];

        for (int i=0;i<str.length();i++){
            if ('a'==str.charAt(i) && !visited[0]){
                count++;
                visited[0]=true;

            } else if ('e'==str.charAt(i) && !visited[1]) {
                count++;
                visited[1]=true;


            } else if ('i'==str.charAt(i) && !visited[2]) {
                count++;
                visited[2]=true;

            } else if ('o'==str.charAt(i)  && !visited[3]) {
                count++;
                visited[3]=true;

            } else if ('u'==str.charAt(i) && !visited[4]) {
                count++;
                visited[4]=true;

            }


        }
        return count;
    }
    static double vowels_find(int[] nums,int k){
        double windowsum=0;
        for (int i=0;i<k;i++){
            windowsum+=nums[i];
        }
        double max=windowsum;

        for(int j=k;j<nums.length;j++){
            windowsum+=nums[j]-nums[j-k];
            max=Math.max(max,windowsum);
        }
        return (double)max/k;

    }
    static int maxvowel(String str,int k){
        int count=0;
        for (int i=0;i<k;i++){
            if (str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u'  ){
                count++;
            }

        }
        int max=count;
        for(int j=k;j<str.length();j++){
            if (str.charAt(j)=='a' || str.charAt(j)=='e' ||str.charAt(j)=='i' || str.charAt(j)=='o' ||str.charAt(j)=='u'  ){

                count++;
            }
            if (str.charAt(j-k)=='a' || str.charAt(j-k)=='e' ||str.charAt(j-k)=='i' || str.charAt(j-k)=='o' ||str.charAt(j-k)=='u'  ){

                count--;
            }
            max=Math.max(max,count);

        }
        return max;
    }

    public  int maxVowels(String s, int k) {
        // Convert to primitive char array for much faster memory access
        char[] chars = s.toCharArray();
        int count = 0;

        // 1. Initial Window
        for (int i = 0; i < k; i++) {
            if (isVowel(chars[i])) {
                count++;
            }
        }

        int max = count;

        // 2. Sliding Window
        for (int j = k; j < chars.length; j++) {
            // Add incoming character
            if (isVowel(chars[j])) {
                count++;
            }
            // Subtract outgoing character
            if (isVowel(chars[j - k])) {
                count--;
            }

            // Quick comparison (faster than Math.max for basic primitives)
            if (count > max) {
                max = count;
            }

            // Optimization: If we already found a window with max possible vowels, return early
            if (max == k) {
                return max;
            }
        }

        return max;
    }

    // Inline lookup helper
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
        vowels_find obj= new vowels_find();
        String str= "abciiidef";
        int[] nums={5};
        int k=3;
//        System.out.println(vowels_check(str));
//        System.out.println(vowels_find(nums,k));
//        System.out.println(maxvowel(str,k));
        System.out.println(obj.maxVowels(str,k));


    }
}
