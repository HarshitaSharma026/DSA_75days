package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {

  }

  // merge intervals
  // ---------- The brute force approach, trying to solve it using
  // Time complexity: O(nlogn + 2n), beacuse we are traversing each element 2
  // times
  static int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    int len = intervals.length;
    List<int[]> list = new ArrayList<>();
    for (int i = 0; i < len; i++) {
      int start = intervals[i][0];
      int end = intervals[i][1];
      if (!list.isEmpty() && end <= list.get(list.size() - 1)[1]) {
        continue;
      }
      for (int j = i + 1; j < len; j++) {
        if (intervals[j][0] <= end) {
          // if the first value of next array is not within the range, update the end
          end = Math.max(end, intervals[j][1]);
        } else {
          // if it's within the range, no need to check further as the array is sorted
          break;
        }
      }
      list.add(new int[] { start, end });
    }
    int[][] ans = new int[list.size()][2];
    for (int i = 0; i < list.size(); i++) {
      ans[i] = list.get(i);
    }
    return ans;
  }

  // ----------- Greedy approach 
  // ------------- Time complexity: O(nlog n + n)
  public int[][] mergeGreedy(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    int len = intervals.length;
    List<int[]> list = new ArrayList<>();
    int start = intervals[0][0];
    int end = intervals[0][1];

    for (int i = 1; i < len; i++) {
      if (intervals[i][0] <= end) {
        end = Math.max(end, intervals[i][1]);
      } else {
        list.add(new int[] { start, end });
        start = intervals[i][0];
        end = intervals[i][1];
      }
    }
    list.add(new int[] { start, end });
    int[][] ans = new int[list.size()][2];
    for (int i = 0; i < list.size(); i++) {
      ans[i] = list.get(i);
    }
    return ans;
  }
}
