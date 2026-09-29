package DSA;

import java.util.Arrays;

public class Max_subArray {
    static int maxSubArray(int[] nums){
        int maxsoFar=nums[0],curr=nums[0];
        for (int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            maxsoFar=Math.max(maxsoFar,curr);
        }
        return maxsoFar;

    }

    public static void main(String[] args){
        int[] nums={2,4,1,-2,5,8,-1};
        System.out.println( maxSubArray(nums));

    }
}
