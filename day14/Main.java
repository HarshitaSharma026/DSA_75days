import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    String s = "geeksforgeeks";
    duplicatesInString(s);
  }

  // ---------- to find duplicates in a string
  // ---- TreeMap is used as it maine the natural order of elements (store in
  // aplhabetical order)
  // ----- Time complexity: O(n), Space: O(n)

  static void duplicatesInString(String s) {
    // HashMap<Character, Integer> map = new HashMap<>();
    TreeMap<Character, Integer> map = new TreeMap<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      // if (map.containsKey(ch)) {
      // map.put(ch, map.get(ch) + 1);
      // }
      // else {
      // map.put(ch, 1);
      // }
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
      }

    }
  }

  // ---------- best time to buy and sell stocks
  static int bestTimeToSellStocks(int[] prices) {
    int profit = 0, buy = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < buy) {
        buy = prices[i];
      } else {
        int diff = prices[i] - buy;
        profit = Math.max(profit, diff);
      }
    }
    return profit;
  }

  // ---------- pair with 0 sum
  public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
    int p1 = 0, p2 = arr.length - 1;
    HashSet<String> set = new HashSet<>();
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    Arrays.sort(arr);
    while (p1 < p2) {
      if (Math.abs(arr[p1]) > Math.abs(arr[p2])) {
        p1++;
      } else if (Math.abs(arr[p1]) < Math.abs(arr[p2])) {
        p2--;
      } else {
        if (arr[p1] + arr[p2] == 0) {
          String pair = arr[p1] + ", " + arr[p2];
          if (set.add(pair)) {
            list.add(new ArrayList<>(Arrays.asList(arr[p1], arr[p2])));
          }
          p1++;
          p2--;
        } else if (arr[p1] + arr[p2] < 0) {
          p1++;
        } else {
          p2--;
        }
      }
    }
    return list;
  }
}
