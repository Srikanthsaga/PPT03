import java.util.Arrays;

public class PPT303 {
    public void nextPermutation(int[] nums) {
        // Find the first decreasing element from the right
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Find the next greater element from the right
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            // Swap the elements at indices i and j
            swap(nums, i, j);
        }

        // Reverse the remaining elements after index i+1
        reverse(nums, i + 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        PPT303 solution = new PPT303();
        solution.nextPermutation(nums);
        System.out.println("Output: " + Arrays.toString(nums));
    }
}
