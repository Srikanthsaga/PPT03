public class PPT306 {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        PPT306 solution = new PPT306();
        int result = solution.singleNumber(nums);
        System.out.println("Output: " + result);
    }
}
