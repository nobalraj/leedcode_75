package practies;

import java.lang.reflect.Array;
import java.util.Arrays;

public class two_Sum {
    static int[][] twoSum(int[] nums, int target){
        int value=0;
        for (int i=0;i<nums.length;i++){
            for (int j=i;j<nums.length;j++){
                value=nums[j]+nums[j+1];
                if (value==target){
                    return new int[j][j+1];
                }


            }

        }

        return new int [-1][-1];
    }
    public static void main(String[] args){
        int[] nums= {1, 2, 3, 4, 5, 6, 7};
        int target=5;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
}
