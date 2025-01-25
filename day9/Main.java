import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter n: ");
    int n = sc.nextInt();
    System.out.println("Enter array elements: ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
  }

  // find the duplicate in n+1 numbers array, numbers from [1,n]
  // without modifying the array in any way and in constant space
  // fast and slow pointer
  static int findDuplicate(int[] nums, int n) {
    int slow = nums[0];
    int fast = nums[0];

    do {
      slow = nums[slow];
      fast = nums[nums[fast]];
    } while (slow != fast);
    // slow == fast, means cycle found. now find the starting pt, that is actually
    // making the cycle.
    slow = nums[0];
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }
    return slow;
  }

  // minimum jump to reach the end of the array
  // greedy algo
  static int minimumJumps(int[] arr) {
    int n = arr.length;
    if (n == 1) {
      return 0;
    }
    if (arr[0] == 0) {
      return -1;
    }
    int maxIndex = arr[0];
    int rangeIndex = arr[0];
    int jumps = 1;

    for (int i = 1; i < n; i++) {
      if (i == n - 1) {
        return jumps;
      }

      maxIndex = Math.max(maxIndex, arr[i] + i);

      if (i == rangeIndex) {
        jumps++;
        rangeIndex = maxIndex;

        if (rangeIndex >= n - 1) {
          return jumps;
        }
      }
      if (i >= maxIndex) {
        return -1;
      }
    }
    return -1;
  }

}