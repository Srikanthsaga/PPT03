import java.util.ArrayList;
import java.util.List;

public class PPT307 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> missingRanges = new ArrayList<>();

        // Helper function to add the range to the result list
        // if lower is less than or equal to upper
        addRange(missingRanges, lower, upper);

        for (int num : nums) {
            // If the current number is the same as lower, increment lower
            if (num == lower) {
                lower++;
            }
            // If the current number is greater than lower, there is a missing range
            else if (num > lower) {
                addRange(missingRanges, lower, num - 1);
                lower = num + 1;
            }
        }

        // Add the final range from lower to upper
        addRange(missingRanges, lower, upper);

        return missingRanges;
    }

    private void addRange(List<String> missingRanges, int start, int end) {
        if (start > end) {
            return;
        } else if (start == end) {
            missingRanges.add(Integer.toString(start));
        } else {
            missingRanges.add(start + "->" + end);
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;

        PPT307 solution = new PPT307();
        List<String> result = solution.findMissingRanges(nums, lower, upper);
        System.out.println("Output: " + result);
    }
}
