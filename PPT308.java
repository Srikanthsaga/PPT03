import java.util.Arrays;

public class PPT308 {
    public boolean canAttendMeetings(int[][] intervals) {
        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Check if there is any overlap between consecutive meetings
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};

        PPT308 solution = new PPT308();
        boolean result = solution.canAttendMeetings(intervals);
        System.out.println("Output: " + result);
    }
}
