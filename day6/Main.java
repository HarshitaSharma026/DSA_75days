import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter n: ");
    int n = sc.nextInt();
    System.out.println("Enter array elements: ");
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // reverseArray(arr,n);
    // System.out.println(Arrays.toString(arr));

    int[] ans = maxMin(arr);
    System.out.println(Arrays.toString(ans));
  }

// Reverse an array
  static void reverseArray(int[] arr, int n) {
    int start = 0, end = n-1;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++; end--;
    }
  }

  // Maximum and minimum of an array
  static int[] maxMin(int[] arr) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < arr.length; i++) {
      max = arr[i] > max ? arr[i] : max;
      min = arr[i] < min ? arr[i] : min;
    }
    return new int[]{max, min};
  }

  // Find kth max and min elements of an array - Using QuickSelect algo
  public static int kthSmallest(int[] arr, int k) {
    return quickSelect(arr, 0, arr.length - 1, k);
  }

  private static int quickSelect(int[] arr, int low, int high, int k) {
    if (low <= high) {
      int pivotIndex = partition(arr, low, high);

      // If pivotIndex matches the (k-1)th position, we found the kth smallest element
      if (pivotIndex == k - 1) {
         return arr[pivotIndex];
      } 
      else if (pivotIndex > k - 1) {
        // Look in the left partition
        return quickSelect(arr, low, pivotIndex - 1, k);
      } 
      else {
        // Look in the right partition
        return quickSelect(arr, pivotIndex + 1, high, k);
      }
    }
    return -1; 
  }

  private static int partition(int[] arr, int low, int high) {
    int pivot = arr[high]; // Choose the last element as the pivot
    int i = low - 1; // Position for smaller elements

    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        // Swap arr[i] and arr[j]
        swap(arr, i, j);
      }
    }

    // Place the pivot in the correct position
    swap(arr, i + 1, high);
    return i + 1; // Return the pivot index
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // Sort 0s, 1s and 2s in the array
  static void sort(int[] arr) {
    int count0 = 0, count1 = 0, count2 = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            }
            else if (arr[i] == 1) {
                count1++;
            }
            else {
                count2++;
            }
        }
        int j = 0, k = 0;
        while (j < count0) {
            arr[k] = 0;
            k++; j++;
        }
        j = 0;
        while (j < count1) {
            arr[k] = 1;
            k++; j++;
        }
        j = 0;
        while (j < count2) {
            arr[k] = 2;
            k++; j++;
        }
  }

// sort the array with 0,1,2 (Using Dutch National flag algorithm)
  public void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        // idea is to check mid:
        /*
            if (mid == 0) -> swap low and mid, low++, mid++
            if (mid == 1) -> move forward
            if (mid == 2) -> swap high and mid, high++
        */
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap (low, mid, arr);
                low++; mid++;
            }
            else if (arr[mid] == 2) {
                swap(mid, high, arr);
                high--;
            }
            else {
                mid++;
            }
        }
    }
    public void swap(int pos1, int pos2, int[] arr) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

}