import java.util.*;
import java.lang.*;

public class Set2 {
  public static void main(String[] args) {
    // int[] arr = { 2, 3, 5, 7, 1, 4, 8 };
    // int k = 8;
    // System.out.println(minimumSelves(arr, k));

    int[] arr = {2,1,3,5};
    System.out.println(missingTransaction2(arr));
  }

  static int minimumSelves(int[] arr, int k) {
    if (arr.length == 0) {
      return -1;
    }
    Arrays.sort(arr);
    int csum = arr[0], prev = arr[0], count = 0;
    for (int i = 1; i < arr.length; i++) {
      csum += arr[i];
      if (csum == k) {
        count++;
        csum = 0;
        prev = 0;
      } else if (csum > k) {
        count++;
        csum = arr[i];
        prev = csum;
      } else {
        prev = csum;
      }
    }
    if (csum <= k) {
      count++;
    }
    return count;
  }

  static int missingTransaction(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      if (arr[i] <= arr.length) {
        int ind = arr[i] - 1;
        if (arr[i] != arr[ind]) {
          swap(arr, ind, i);
        }
        else {
          i++;
        }
      }
      else {
        i++;
      }
    }
    int j = 0;
    while (j < arr.length) {
      if (j != arr[j] - 1) {
        return (j+1);
      }
      else {
        j++;
      }
      
    }
    return -1;
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static int missingTransaction2(int[] arr) {
    int total = 0, sum = 0;
    for(int i = 1; i <= arr.length; i++) {
      sum += i;
    }
    for(int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println(sum + total);
    if (sum == total) {
      return -1;
    }
    return ((sum - total) + 1);
  }
}
