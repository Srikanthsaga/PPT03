import java.util.Arrays;

public class PPT305 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        // If all digits are 9, create a new array with an additional leading 1
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        PPT305 solution = new PPT305();
        int[] result = solution.plusOne(digits);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
