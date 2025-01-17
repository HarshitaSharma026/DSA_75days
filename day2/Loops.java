import java.util.Scanner;
import java.lang.Math;

class Loops {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 8 - reverse a number
    // System.out.println("Enter number to reverse: ");
    // int n = sc.nextInt();
    // int sum = 0;
    // while (n > 0) {
    //   int rem = n % 10;
    //   sum = (sum * 10) + rem;
    //   n /= 10;
    // }
    // System.out.println("Reverse: " + sum);

    // 9 - sum of all digits
    // System.out.println("Enter number to sum: ");
    // int nsum = sc.nextInt();
    // int add = 0;
    // while (nsum > 0) {
    //   int rem = nsum % 10;
    //   add += rem;
    //   nsum /= 10;
    // }
    // System.out.println("Add: " + add);

    // 11 - calculate power of a number
    // System.out.println("Enter number: ");
    // int num = sc.nextInt();
    // System.out.println("Enter power: ");
    // int power = sc.nextInt();
    // int prod = 1;
    // for(int i = 1; i <= power; i++) {
    //   prod *= num;
    // }
    // System.out.println("Power: " + prod);

    // 12 - check palindrome
    // System.out.println("Enter number (palindrome check): ");
    // int p = sc.nextInt();
    // int temp = p;
    // int newnumber = 0;
    // while (p > 0) {
    //   int rem = p % 10;
    //   newnumber = (newnumber * 10) + rem;
    //   p /= 10;
    // }
    // System.out.println("Newnumber: " + newnumber);
    // System.out.println("Old number: " + temp);
    // System.out.println("Palindrome: " + (newnumber == temp));

    // 13 - check prime number
    // simplest method - o(n)
    // System.out.println("Enter number to check for prime: ");
    // int prime = sc.nextInt();
    // int i = 2;
    // boolean flag = false;
    // while (i < prime) {
    //   if(prime % i == 0) {
    //     flag = true;
    //     break;
    //   }
    //   i++;
    // }
    // System.out.println("Prime: " + ((flag) ? "not prime" : "prime"));

    // optimized - o(sqrt(n)), here we only make checks for n <= sqrt(n)
    // int c = 2;
    // while(c <= Math.sqrt(prime)) {
    //   if (prime % c == 0) {
    //     System.out.println("not prime");
    //     break;
    //   }
    //   else {
    //     System.out.println("prime");
    //   }
    //   c++;
    // }
    


    // 14 - prime number within the range,  o(n(log(log n)))
    // System.out.println("Enter starting number: ");
    // int start = sc.nextInt();
    // System.out.println("Enter ending number: ");
    // int end = sc.nextInt();
    // boolean[] numbers = new boolean[end];
    // for(int j = start; j <= Math.sqrt(end); j++) {
    //   if (!numbers[j]) {
    //     // if "false", means we have not checked multiples of this number
    //     for(int k = j * 2; k < end; k += j){
    //       numbers[k] = true;
    //     }
    //   }
    // }
    // for(int x = start; x < end; x++) {
    //   if (!numbers[x]) {
    //     System.out.print(" " + x);
    //   }
    // }

    // 15 - armstrong number
    // System.out.println("Enter number (for armstrong check): ");
    // int anum = sc.nextInt();
    // int atemp = anum;
    // int digits = (int) Math.log10(anum) + 1;
    // int asum = 0;

    // while (atemp > 0) {
    //   int rem = atemp % 10;
    //   asum += Math.pow(rem, digits);
    //   atemp /= 10;
    // }

    // System.out.println("Armstrong number: " + (anum == asum ? "armstrong" : "not armstrong"));

    // 16 - factors of a number
    System.out.println("Enter number (for factors): ");
    int fact = sc.nextInt();
    for(int y = 1; y <= Math.sqrt(fact); y++) {
      if (fact % y == 0) {
        if (fact / y == y) {
          System.out.print(y + ", ");
        }
        else {
          System.out.print(y + ", " + fact / y +" ");
        }
      }
    }
    System.out.println();

  }
}

// REVISION
// 1. Other way for palindrome
// 2. Other way for prime number
// 3. Prime number, within range also
// 4. Finding number of digits formula
// 5. Factors of a number