package interview_75_DSA.Week_2_21_09_26;

public class Container_with_watter_11 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            System.out.println(area);
            if (area > max) {
                max = area;
            }
            if (height[left] < height[right]) {
                left++;

            }else {
                right--;
            }


        }
        return max;

    }

    public static void main(String[] args){
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}

