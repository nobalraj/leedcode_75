package interview_75_DSA;

import java.util.Arrays;

public class maxOperations {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int j=0;
        int left=0;
        int right=nums.length-1;
        int summ=nums[left]+nums[right];

        while (left<right){
            if (summ==k){
                left++;
                right--;
                j++;
            }else if(summ<k) {
                left++;

            }else {
                right--;
            }

        }
        return j;

    }
    public static void main(String[] args){
        int []nums = {3,1,3,4,3};
        int k=6;
        System.out.println(maxOperations(nums,k));


    }
}
