import java.math.BigInteger;
import java.util.ArrayList;

public class Main18 {
  public static void main(String[] args) {
    factorial(10);
  }

  // ------------ to find factorial of large numbers like 20! -> using "BigInteger"
  public static ArrayList<Integer> factorial(int n) {
    BigInteger factNumber = fact(BigInteger.valueOf(n));
    ArrayList<Integer> list = new ArrayList<>();

    String str = factNumber.toString();
    for (char ch : str.toCharArray()) {
      list.add(ch - '0');
    }
    return list;
  }

  public static BigInteger fact(BigInteger n) {
    if (n.compareTo(BigInteger.ONE) <= 0) {
      return BigInteger.ONE;
    }
    return n.multiply(fact(n.subtract(BigInteger.ONE)));
  }
}
