import java.util.Arrays;

public class PPT300 {
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        // Initialize the closest sum to a large value
        int closestSum = Integer.MAX_VALUE;

        // Iterate through the array, fixing the first element
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Pointer for the second element
            int right = nums.length - 1; // Pointer for the third element

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // Check if the current sum is closer to the target
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                // Adjust the pointers based on the sum
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    // If the sum is equal to the target, return it
                    return target;
                }
            }
        }

        // Return the closest sum
        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        PPT300 solution = new PPT300();
        int result = solution.threeSumClosest(nums, target);
        System.out.println("Output: " + result);
    }
}
