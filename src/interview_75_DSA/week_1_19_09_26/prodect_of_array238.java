package interview_75_DSA.week_1_19_09_26;

import java.util.ArrayList;
import java.util.Arrays;

public class prodect_of_array238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] result2 = new int[n];

        int val = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = val;
            val *= nums[i];
        }
        int rval = 1;
        for (int j = n - 1; j >= 0; j--) {
            result[j] = result[j] * rval;
            rval *= nums[j];

            // System.out.println(rval);

        }
        return result;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 4 };
        prodect_of_array238 obj = new prodect_of_array238();
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));

    }

}
