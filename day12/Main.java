package day12;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

  }

  // --------- reverse a string
  public void reverseString(char[] s) {
    int start = 0, end = s.length - 1;
    while (start < end) {
      char temp = s[start];
      s[start] = s[end];
      s[end] = temp;
      start++;
      end--;
    }
  }

  // ------ to find the next permutation in an array
  // ----- Optimized approach, Time complexity: O(nlogn + n)
  public void nextPermutation(int[] nums) {
    int ind = -1;
    int n = nums.length;
    // 1. find the break point
    for (int i = n - 2; i >= 0; i--) {
      if (nums[i] < nums[i + 1]) {
        ind = i;
        break; // we have found our break point
      }
    }

    // if no breakpoint means the array is sorted in descending order
    if (ind == -1) {
      reverse(nums);
    } else {
      for (int i = n - 1; i >= 0; i--) {
        if (nums[i] > nums[ind]) {
          swap(nums, i, ind);
          break;
        }
      }
      Arrays.sort(nums, ind + 1, n);
    }
  }

  public void reverse(int[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public void swap(int[] arr, int i, int ind) {
    int temp = arr[i];
    arr[i] = arr[ind];
    arr[ind] = temp;
  }
}
