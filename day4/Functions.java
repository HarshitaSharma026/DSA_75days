import java.util.*;

class Functions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 2, print the pair of prime number 
    System.out.println("Enter n: ");
    int n = sc.nextInt();

// complexity: O(n * srqt(n))
    for(int i = 2; i <= (n/2); i++) {
      if (isPrime(i)) {
        int diff = n - i;
        if (isPrime(diff)) {
          System.out.println(i +", " + diff);
        }
      }
    }

    // the other way for the above question is: using seive of eratosthenes, (fidning all prime number)
    // complexity: O(n * log(log(n)))
    boolean[] arr = findAllPrimes(n);
    for(int i = 2; i <= (n/2); i++) {
      int diff = n - i;
      if (!arr[i] && !arr[diff]) {
        System.out.println(i +", " + diff);
      }
    }


    // 3. Program to convert binary to decimal manually
    System.out.println("Enter binary no: ");
    // int binary = sc.nextInt();
    String binary = sc.next();
    // System.out.println(convertToDecimal(binary));

    // other way
    int n = Integer.parseInt(binary, 2);
    System.out.println("using method: " + n);

    // 4. program to convert decimal to binary manually
    System.out.println("Enter decimal no: ");
    int decimal = sc.nextInt();
    System.out.println(convertToBinary(decimal));
    String str = Integer.toBinaryString(decimal);
    System.out.println("Using method: " + str);
  }

  static boolean isPrime(int num) {
    for(int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  static boolean[] findAllPrimes(int n) {
    boolean[] arr = new boolean[n];
    for(int i = 2; i < Math.sqrt(n); i++) {
      if (!arr[i]) {
        for(int j = i * 2; j < n; j += i) {
          arr[j] = true;
        }
      }
    }
    return arr;
  }

  static int convertToDecimal(int n) {
    int sum = 0, len = 0;
    while (n > 0) {
      int rem = n % 10;
      sum = sum +(int) (rem * Math.pow(2, len++));
      n /= 10;
    }
    return sum;
  }

  static String convertToBinary(int n){
    StringBuilder ans = new StringBuilder();
    while (n > 0) {
      int rem = n % 2;
      ans.append(rem);
      n /= 2;
    }
    return ans.reverse().toString();
  }
}

/*
    Decimal to binary conversion
    1. Manually, using Math.pow : O(log n)
    2. Method: Integer.toBinaryString(): O(log n)
    3. Bitwise Operators: O(1)

    Binary to Decimal conversion
    1. Manually, using Math.pow: O(log n)
    2. Method: Integer.parseInt((string)binary, 2);
*/