package DSA.Extra_Practise_problems;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // Pointer for the position of unique elements

        for (int j = 1; j < nums.length; j++) {
            // Found a new unique element
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // Move unique element to position i
            }
        }

        return i + 1; // Return length of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        int length = removeDuplicates(nums);

        System.out.println("New Length: " + length);

        // Print the first 'length' elements of the modified array
        System.out.print("Modified Array: [");
        for (int k = 0; k < length; k++) {
            System.out.print(nums[k] + (k < length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}