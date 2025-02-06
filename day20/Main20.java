import java.util.Arrays;
import java.util.HashMap;

public class Main20 {
  public static void main(String[] args) {

  }

  // ------------ function to check if b[] is subset of a[]
  // Time: O(n), Space: O(n)
  public boolean isSubset(int a[], int b[]) {
    if (b.length > a.length) {
      return false;
    }
    // if (a.length == 1 && b.length == 1) {
    // return a[0] == b[0];
    // }
    // redundant check as the overhead of creating a hashmap with 1 value is
    // neglible.

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      map.put(a[i], map.getOrDefault(a[i], 0) + 1);
    }

    for (int i = 0; i < b.length; i++) {
      if (map.containsKey(b[i])) {
        if (map.get(b[i]) == 0) {
          return false;
        } else {
          map.put(b[i], map.get(b[i]) - 1);
        }
      } else {
        return false;
      }
    }
    return true;
  }

  // ------------ another way using sorting and two pointer
  public boolean isSubsetSorting(int a[], int b[]) {
    if (b.length > a.length) {
      return false;
    }
    Arrays.sort(a);
    Arrays.sort(b);
    int p1 = 0, p2 = 0;

    while (p1 < a.length && p2 < b.length) {
      if (a[p1] == b[p2]) {
        p1++;
        p2++;
      } else if (a[p1] < b[p2]) {
        p1++;
      } else if (a[p1] > b[p2]) {
        return false;
      }
    }
    return true;
  }
}
