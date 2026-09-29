package interview_75_DSA.Reverse;

public class Reverse_Word {
    public static void main(String[] args){
        String s="the sky is blue";
//        String[] str=s.trim().split("\\s+ ");

//       First Approch
//        int j=0;
//        for(int i=str.length-1;i>=0;i--){
//            str[j++]=str[i];
//
//        }
//        for (String word:str){
//            System.out.println(word);
//        }

//    Second Approch  time o(n)

//        int left=0;
//        int right= str.length-1;
//        while (left<right){
//            String temp=str[left];
//            str[left]=str[right];
//            str[right]=temp;
//            left++;
//            right--;
//        }
//
//        String ss=String.join(" ",str);
//
//        System.out.println(ss.length() + " "+ ss);
//        System.out.println(ss.trim());
//
//        System.out.println(ss.length() + " "+ ss);


//        3rd Approach

        String[] str=s.split("\\s+");
        StringBuilder ss=new StringBuilder();

        for (int i=str.length-1;i>=0;i--){
            ss.append(str[i]);
            if(i!=0){
                ss.append(" ");
            }
        }
        System.out.println( ss.toString().trim());

    }
}
