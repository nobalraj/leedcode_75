package practies;

public class mxsum {
    static int maxsum(int[] nums){
        int maxsoff=nums[0],curr=nums[0];
        for (int i=1;i<nums.length;i++){
            curr=Math.max(nums[i], curr+nums[i]);
            maxsoff=Math.max(maxsoff,curr);

        }
        return maxsoff;
    }

    public static void main(String[] args){
        int[] nums= {1, 2, 3, 4, 5, 6, 7};
        System.out.println(maxsum(nums));

    }
}
