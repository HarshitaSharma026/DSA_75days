import java.util.*;

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
    // arrangeNegativePositive(arr);
    // System.out.println(Arrays.toString(arr));

    rotateByOne(arr);
    System.out.println(Arrays.toString(arr));
  }

  // Move all negative numbers to beginning and positive to end with constant extra space --------
  // time complexity: O(n), space: O(1)
  // public static void arrangeNegativePositive(int[] arr) {
  //   int negative = 0, positive = arr.length - 1;
  //   while (negative <= positive) {
  //     if (arr[negative] < 0) {
  //       // negative number at the correct position
  //       negative++;
  //     }
  //     else if (arr[positive] >= 0) {
  //       // positive number at the correct position
  //       positive--;
  //     }
  //     else {
  //       swap(arr, negative, positive);
  //       negative++; positive--;
  //     }
  //   }
  // }

  // private static void swap(int[] arr, int a, int b) {
  //   int temp = arr[a];
  //   arr[a] = arr[b];
  //   arr[b] = temp;
  // }

  // ---------- count the number of elements in union of 2 arrays
  // Time complexity: O(n), space: O(n)
  // public int countNumbers(int[] arr1, int[] arr2) {
  //   HashSet<Integer> set = new HashSet<>();
  //   for(int i = 0; i < a.length; i++) {
  //     set.add(a[i]);
  //   }
  //   for(int i = 0; i < b.length; i++) {
  //     set.add(b[i]);
  //   }
  //   return set.size();
  // }

  // --------- rotate array by 1
  public static void rotateByOne(int[] arr) {
    int temp = arr[arr.length - 1];
    for(int i = arr.length - 1; i > 0; i--) {
      arr[i] = arr[i-1];
    }
    arr[0] = temp;
  }
}