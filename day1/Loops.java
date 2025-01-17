import java.util.Scanner;

class Loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1.
    // System.out.println("Enter number: ");
    // int n = sc.nextInt();
    // int sum = 0;
    // for(int i = 1; i <= n; i++) {
    //   sum += i;
    // }
    // System.out.println(sum);

    // 2.
    // System.out.println("Enter fact number: ");
    // int num = sc.nextInt();
    // int prod = 1;
    // for(int i = 1; i <= num; i++) {
    //   prod *= i;
    // }
    // System.out.println(prod);

    // 3. fibonacci series
    // int a = 0;
    // int b = 1;
    // System.out.println("Enter fib number: ");
    // int fibno = sc.nextInt();
    // System.out.print(a +" " +b);
    // for(int i = 3; i <= fibno; i++) {
    //   int c = a + b;
    //   System.out.print(" " +c);
    //   a = b;
    //   b = c;
    // }
    // System.out.println();

    // 4. hcf or gcd
    System.out.println("Enter n1: ");
    int n1 = sc.nextInt();
    int ogn1 = n1;
    System.out.println("Enter n2: ");
    int n2 = sc.nextInt();
    int ogn2 = n2;

    // this formula is same as: "finding hcf using long division method".
    while (n2 != 0) { 
      int temp = n2;
      n2 = n1 % n2;
      n1 = temp;
    }
    int hcf = n1;

    // 5. lcf
    // int lcm = (ogn1*ogn2)/hcf;
    // or
    int lcm = Math.max(ogn1, ogn2);
    while (true) {
      if (lcm % ogn1 == 0 && lcm % ogn2 == 0) {
        break;
      }
      lcm++;
    }
    System.out.println("Lcm: " + lcm +", hcf: " + hcf);
  } 
}

// REVISION
// 1. HCF and LCM
