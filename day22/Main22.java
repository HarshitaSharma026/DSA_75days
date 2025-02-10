package day22;

import java.util.ArrayList;
import java.util.Collections;

public class Main22 {
  public static void main(String[] args) {

  }

  // --------- find a smallest subarray in which sum of elments > x
  public static int smallestSubWithSum(int x, int[] arr) {
    int p1 = 0;
    int sum = 0, min = Integer.MAX_VALUE;
    for (int p2 = 0; p2 < arr.length; p2++) {
      sum += arr[p2];

      while (sum > x) {
        min = Math.min(min, p2 - p1 + 1);
        sum -= arr[p1];
        p1++;
      }
    }

    return min == Integer.MAX_VALUE ? 0 : min;
  }

  // ---------- to find the minimum difference between min chocolate and max chocolate given to a student
  public int findMinDiff(ArrayList<Integer> arr, int m) {
    int min = Integer.MAX_VALUE;
    if (m == 1) {
      return 0;
    }
    if (arr.size() < m) {
      return -1;
    }
    Collections.sort(arr);
    int p1 = 0, p2 = m - 1;
    while (p2 < arr.size()) {
      int diff = arr.get(p2) - arr.get(p1);
      min = Math.min(min, diff);
      p1++;
      p2++;
    }
    return min;
  }
}
