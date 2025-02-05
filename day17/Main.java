package day17;

import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

  }

  // Function to check whether there is a subarray present with 0-sum or not.
  static boolean findsum(int arr[]) {
    HashSet<Integer> set = new HashSet<>();
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum == 0 || !set.add(sum)) {
        return true;
      }
    }
    return false;
  }

  // count and say problem strings
  public String countAndSay(int n) {
    if (n == 1) {
      return "1";
    }

    StringBuilder sb = new StringBuilder("1");
    for (int i = 2; i <= n; i++) {
      StringBuilder mid = new StringBuilder();
      int count = 1;
      for (int j = 1; j < sb.length(); j++) {
        if (sb.charAt(j) == sb.charAt(j - 1)) {
          count++;
        } else {
          mid.append(count);
          mid.append(sb.charAt(j - 1));
          count = 1;
        }
      }
      mid.append(count);
      mid.append(sb.charAt(sb.length() - 1));
      sb = mid;
    }
    return sb.toString();
  }
}
