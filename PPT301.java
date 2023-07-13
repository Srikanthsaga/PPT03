import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PPT301 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array in ascending order
        Arrays.sort(nums);

        int n = nums.length;

        // Fix the first and second elements
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                // Skip duplicates for the first element
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    // Skip duplicates for the second element
                    continue;
                }

                int left = j + 1; // Pointer for the third element
                int right = n - 1; // Pointer for the fourth element

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        // Found a valid quadruplet
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for the third element
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        // Skip duplicates for the fourth element
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        // Move the pointers inward
                        left++;
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        PPT301 solution = new PPT301();
        List<List<Integer>> result = solution.fourSum(nums, target);
        System.out.println("Output: " + result);
    }
}
