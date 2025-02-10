import java.util.Arrays;

public class Set1 {
  public static void main(String[] args) {
    int[] arr = {1,0,0,1,1,0,2,1,2,0};
    arrangePackages(arr);
    System.out.println(Arrays.toString(arr));

    int[] arr2 = {0,4,1,3,2};
    System.out.println(findDuplicateAccountID(arr2));
  }

  static void arrangePackages(int[] arr) {
    int low = 0, mid = 0, high = arr.length - 1;
    while (mid < high) {
      if (arr[mid] == 0) {
        swap(arr, mid, low);
        mid++; low++;
      }
      else if (arr[mid] == 2) {
        swap(arr, mid, high);
        high--;
      }
      else {
        mid++;
      }
    }
  }
  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static int findDuplicateAccountID(int[] arr) {
    if (arr.length <= 1) {
      return -1;
    }
    int fast = arr[0], slow = arr[0];
    do {
      slow = arr[slow];
      fast = arr[arr[fast]];
    } while (fast < arr.length && slow != fast);

    slow = 0;
    while (slow != fast) {
      slow = arr[slow];
      fast = arr[fast];
    }
    return slow;
  }
}
