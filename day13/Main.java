package day13;

public class Main {
  public static void main(String[] args) {

  }

  // ----------- count inversion - using merge sort
  // time complexity: O(nlogn)
  static int inversionCount(int arr[]) {
    return mergeSort(arr, 0, arr.length - 1);
  }

  static int mergeSort(int[] arr, int low, int high) {
    int count = 0;
    if (low >= high) {
      return count;
    }
    int mid = low + (high - low) / 2;
    count += mergeSort(arr, low, mid);
    count += mergeSort(arr, mid + 1, high);
    count += merge(arr, low, mid, high);
    return count;
  }

  static int merge(int[] arr, int low, int mid, int high) {
    int k = 0, count = 0;
    int[] temp = new int[high - low + 1];
    int i = low;
    int j = mid + 1;
    while (i <= mid && j <= high) {
      if (arr[i] <= arr[j]) {
        temp[k++] = arr[i++];
      } else {
        temp[k++] = arr[j++];
        count += (mid - i + 1);
      }
    }
    while (i <= mid) {
      temp[k++] = arr[i++];
    }
    while (j <= high) {
      temp[k++] = arr[j++];
    }
    for (int ind = 0; ind < temp.length; ind++) {
      arr[low + ind] = temp[ind];
    }
    return count;
  }
}
