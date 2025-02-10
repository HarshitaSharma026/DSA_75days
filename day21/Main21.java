package day21;

public class Main21 {
  public static void main(String[] args) {
    
  }

  // ------------ trapping rainwater - 2 techniques

  // ---------- Using leftmax[] and rightmax[]
  static int trappingWater1(int[] arr) {
    int total = 0;
    int[] leftmax = new int[arr.length];
    leftmax[0] = arr[0];
    int[] rightmax = new int[arr.length];
    rightmax[arr.length - 1] = arr[arr.length - 1];

    for(int i = 1; i < arr.length; i++) {
      leftmax[i] = Math.max(leftmax[i-1], arr[i]);
    }
    for(int i = arr.length - 2; i >= 0; i--) {
      rightmax[i] = Math.max(rightmax[i + 1], arr[i]);
    }

    for(int i = 0; i < arr.length; i++) {
      int lm = leftmax[i];
      int rm = rightmax[i];
      total += Math.min(lm, rm) - arr[i];
    }
    return total;
  }

  // ----------- without using additional data structure
  static int trappingWater2(int[] arr) {
    int total = 0;

    int left = 0, right = arr.length - 1;
    int leftmax = 0, rightmax = 0;
    while (left < right) {
      if (arr[left] <= arr[right]) {
        if (leftmax > arr[left]) {
          total += leftmax - arr[left];
        }
        else {
          leftmax = arr[left];
        }
        left++;
      }
      else {
        if (rightmax > arr[right]) {
          total += rightmax - arr[right];
        }
        else {
          rightmax = arr[right];
        }
        right--;
      }
    }
    return total;
  }
}
