package interview_75_DSA;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        // int max=Arrays.stream(candies).max().getAsInt();
        int max = Integer.MIN_VALUE;
        for (int num : candies) {
            max = Math.max(max, num);
        }

        for (int i = 0; i < candies.length; i++) {
            int tot = extraCandies + candies[i];
            if (tot >= max) {
                result.add(true);
            } else {
                result.add(false);
            }

        }
        return result;

    }

    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extracandies = 3;
        System.out.println(kidsWithCandies(candies, extracandies));

    }
}
