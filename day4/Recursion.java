import java.util.*;

class Recursion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter n : ");
    int n = sc.nextInt();

    // 1. sum of n natural number 
    System.out.println(findSum(n));

    // 2. Factorial of a number
    System.out.println(fact(n));

    // 3. GCD of two numbers
    System.out.println("Enter n1: ");
    int n1 = sc.nextInt();
    System.out.println("Enter n2: ");
    int n2 = sc.nextInt();
    System.out.println(gcd(n1,n2));

    // 4. Power of a number
    System.out.println("Enter base: ");
    int base = sc.nextInt();
    System.out.println("Enter exponent: ");
    int exponent = sc.nextInt();
    System.out.println(calculatePower(base, exponent));

  }

  static int findSum(int n) {
    if (n == 1) {
      return 1;
    }
    return n + findSum(n - 1);
  }
  
  static int fact(int n) {
    if (n == 1 || n == 0) {
      return 1;
    }
    return n * fact(n - 1);
  }
  
  static int gcd(int n1, int n2) {
    if (n2 == 0) {
      return n1;
    }
    return gcd(n2, n2 % n1);
  }

  static int calculatePower(int b, int e) {
    if (e == 1) {
      return b;
    }
    return b * calculatePower(b, e - 1);
  }

}