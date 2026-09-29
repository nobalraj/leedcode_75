package interview_75_DSA.Week_2_21_09_26.Sliding_Window;

public class SlidingWindow {
    static double slidingWindow(int[] num,int k){

        double windowsum=0;

        for(int i=0;i<k;i++){
            windowsum+=num[i];
        }
        double max =windowsum;
        for(int j=k;j<num.length;j++){
            windowsum+=num[j]-num[j-k];
            max=Math.max(max,windowsum);
        }return max/k;
    }
    public static void  main(String[] args){
        int[] nums={5};
        int k=1;
        System.out.println(slidingWindow(nums,k));


    }
}
