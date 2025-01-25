// package day10;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter n: ");
    int n = sc.nextInt();
    System.out.println("Enter array elements: ");
    int[] a1 = new int[n];
    for(int i = 0; i < n; i++) {
      a1[i] = sc.nextInt();
    }

    System.out.println("Enter n: ");
    int n2 = sc.nextInt();
    System.out.println("Enter array elements: ");
    int[] a2 = new int[n2];
    for(int i = 0; i < n2; i++) {
      a2[i] = sc.nextInt();
    }
    mergeSortedArray(a1, a2);
    System.out.println(Arrays.toString(a1) + ", " + Arrays.toString(a2));
  }

  // ----------- using simple two pointer technique
  // time complexity: O(m+n), space complexity: O(1)
  static void mergeSortedArray(int[] a1, int[] a2) {
    int left = a1.length - 1;
    int right = 0;
    while (left >= 0 && right < a2.length) {
      if (a1[left] > a2[right]) {
        // swap 
        swap(a1, a2, left, right);
        left--; right++;
      }
      else {
        break;
      }
    }
    Arrays.sort(a1);
    Arrays.sort(a2);
  }

  static void swap(int[] a1, int[] a2, int a, int b) {
    int temp = a1[a];
    a1[a] = a2[b];
    a2[b] = temp;
  }

  // --------- using shell sort - gap method
  static void mergeSortedArrayGap(int[] a1, int a2) {

  }
}
