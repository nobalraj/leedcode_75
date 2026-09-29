package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class two_sum {
    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    //    static int[] twoSum(int[] nums, int target){
//        Map<Integer,Integer>map=new HashMap<>();
//
//        for (int i=0;i<nums.length;i++){
//            int camplement=target-nums[i];
//            if(map.containsKey(camplement)){
//                return new int[] {map.get(camplement),i};
//            }
//            map.put(nums[i],i );
//        }
//        return new int[]{};
//
//    }
    public static void main(String arg[]){
        int nums[]={2,1,4,6,8,5,9};
        int target=5;

        System.out.println(Arrays.toString(twoSum(nums,target)));








    }
}
