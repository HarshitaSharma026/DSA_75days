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
  }

  // ----- to find maximum sum of a subarray
  static int maximumSum(int[] arr, int n) {
    int sum = Integer.MIN_VALUE, csum = 0;
    for(int i = 0; i < arr.length; i++) {
      csum += arr[i];
      sum = csum > sum ? csum : sum;
      if (csum < 0) {
        csum = 0;
      }
    }
    return sum;
  }

  // the mistake i made here was:
  /*
      if (csum < 0) {
        csum = 0;
      }
      writing this condition before comparing sum. it didn't work in case where all the elements in an array are negative 
      arr = [-2, -3] ans should be : -2, but it was giving 0 which was wrong because i was making csum = 0, before comparing it with sum (which initially had a very small value stored in it.)
  */
}