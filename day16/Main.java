import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    String str = sc.next();
    System.out.println(checkShuffle(s1, s2, str));
  }

  static boolean checkShuffle(String x, String y, String str) {
    HashMap<Character, Integer> map = new HashMap<>();

    if (str.length() != (x.length() + y.length())) {
      return false;
    }
    for(int i = 0; i < x.length(); i++) {
      char ch = x.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1); 
    }
    for(int i = 0; i < y.length(); i++) {
      char ch = y.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1); 
    }

    for(int i = 0 ; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (map.containsKey(ch)) {
        map.put(ch, map.get(ch) - 1);
      }
      else {
        return false;
      }
    }

    // for(Map.Entry<Character, Integer> set : map.entrySet()) {
    //   if(set.getValue() != 0) {
    //     return false;
    //   }
    // }

    // better way to do this
    for (int count : map.values()) {
      if (count != 0) {
        return false;
      }
    }
    return true;
  }
}
