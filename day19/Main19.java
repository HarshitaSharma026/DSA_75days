import java.util.Arrays;
import java.util.HashSet;

public class Main19 {
  public static void main(String[] args) {

  }

  // Function to find maximum product subarray
  int maxProduct(int[] arr) {
    int pref = 1, suff = 1;
    int prod = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (pref == 0)
        pref = 1;
      if (suff == 0)
        suff = 1;

      pref *= arr[i];
      suff *= arr[arr.length - i - 1];
      prod = Math.max(prod, Math.max(pref, suff));
    }
    return prod;
  }

  // Function to return length of longest subsequence of consecutive integers.
  // O(nlogn), O(1)
  public int longestConsecutive(int[] arr) {
    Arrays.sort(arr);
    int max = 1, num = arr[0], count = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == num + 1) {
        count++;
        num = arr[i];
      } else if (arr[i] != num) {
        max = Math.max(max, count);
        num = arr[i];
        count = 1;
      }
    }
    max = Math.max(max, count);
    return max;
  }

  // Optimized approach using HashSets
  // O(n), O(n)
  // Function to return length of longest subsequence of consecutive integers.
  public int longestConsecutiveOptimized(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    int max = 1;
    for (int num : arr) {
      set.add(num);
    }

    // traverse set for finding
    for (int num : set) {
      // if this number is the starting
      if (!set.contains(num - 1)) {
        int currentNum = num;
        int count = 1;

        // traverse through the set to check if its consecutive numbers exists in the
        // set
        while (set.contains(currentNum + 1)) {
          currentNum++;
          count++;
        }

        max = Math.max(max, count);
      }
    }
    return max;
  }
}
