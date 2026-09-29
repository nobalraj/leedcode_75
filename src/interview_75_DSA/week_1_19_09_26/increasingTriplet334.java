package interview_75_DSA.week_1_19_09_26;

public class increasingTriplet334 {
    public static boolean increasingTriplet(int nums[]) {

        int first_sumalnum = Integer.MAX_VALUE;
        int second_sumalnum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (first_sumalnum > nums[i]) {
                first_sumalnum = nums[i];

            } else if (nums[i] > first_sumalnum && nums[i] < second_sumalnum) {
                second_sumalnum = nums[i];

            } else if (nums[i] > second_sumalnum) {
                return true;

            }
            {

            }
        }
        return false;

    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println(increasingTriplet(nums));

    }

}