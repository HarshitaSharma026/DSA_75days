import java.util.Scanner;
class Basics {
  public static void main(String[] args) {
    // 1
    System.out.println("Hello world!");

    // 2
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num = sc.nextInt();
    System.out.println(num);

    // 3
    System.out.println("Enter number 1: ");
    int num1 = sc.nextInt();
    System.out.println("Enter number 2: ");
    int num2 = sc.nextInt();
    System.out.println(num1 + num2);

    // 4
    System.out.println("Enter divisor: ");
    int div = sc.nextInt();
    System.out.println("Enter divident: ");
    int divi = sc.nextInt();
    System.out.println("Quotient: " + (divi / div));
    System.out.println("Remainder: " + (divi % div));

    // 5 - size of datatypes
    // In java there is no "sizeof" operator or method to find the size of primitive datatypes, but primitive wrapper classes do provide "SIZE" constant to get the size in bits. (bytes = bits / 8). 
    System.out.println("Integer: "+Integer.SIZE);
    System.out.println("Float: " + Float.SIZE);
    System.out.println("Double: " + Double.SIZE);
    System.out.println("Character: " + Character.SIZE);
    System.out.println("Short: " + Short.SIZE);
    System.out.println("Long: " + Long.SIZE);
    System.out.println("Byte: " + Byte.SIZE);

    // 6. - swap 2 numbers
    int x = 90;
    int y = 23;
    int temp = x;
    x = y;
    y = temp;
    System.out.println("x: " + x + ", y: " + y);

    // swapping without using extra variable - XOR
    x = x ^ y;
    y = x ^ y;
    x = x ^ y;
    System.out.println("x: " + x + ", y: " + y);

    // swapping using + -
    x = x + y;
    y = x - y;
    x = x - y;
    System.out.println("x: " + x + ", y: " + y);

    // 7. ASCII value of a character
    char ch = 'h';
    int var = 42;
    System.out.println("Character at 42: " + (char)var);
    System.out.println((int)ch + 1);
    System.out.println("Character: " + (char)((int)ch + 1));
  }
}

// for Revision
// 1. What are primitives?
// 2. What are wrapper classes? Why we use them ? 
    // Example: SIZE, only available in wrapper classes.
// 3. Swapping without using extra variable
// 4. Printing ascii value