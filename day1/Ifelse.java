import java.util.Scanner;
import java.lang.Math;
class Ifelse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1.
    System.out.println("Enter number: ");
    int num = sc.nextInt();
    String result = num % 2 == 0 ? "even" : "odd";
    System.out.println(result);

    // 2. 
    String vowel = "aeiou";
    System.out.println("Enter a character: ");
    char ch = sc.next().charAt(0);
    String str = String.valueOf(ch);
    // System.out.println("character: " + ch);
    System.out.println(vowel.contains(str) ? "vowel" : "consonant");

    // 3.
    System.out.println("Enter num1: ");
    int num1 = sc.nextInt();
    System.out.println("Enter num2: ");
    int num2 = sc.nextInt();
    System.out.println("Enter num3: ");
    int num3 = sc.nextInt();
    if (num1 > num2 && num1 > num3) {
      System.out.println(num1 + " is greater");
    }
    else if (num2 > num1 && num2 > num3) {
      System.out.println(num2 + " is greater");
    }
    else {
      System.out.println(num3 + " is greater");
    }
    int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
    System.out.println(greatest);

    // 4. quadratic equation
    System.out.println("Enter a : ");
    int a = sc.nextInt();
    System.out.println("Enter b: ");
    int b = sc.nextInt();
    System.out.println("Enter c: ");
    int c = sc.nextInt();
    int d = b * b - 4*a*c;
    double root1 = (-b + Math.sqrt(d)) / (2*a);
    double root2 = (-b - Math.sqrt(d)) / (2*a);
    System.out.println("Root1: " + root1 +", Root 2: " + root2);

    // 5. leap year
    System.out.println("Enter year: ");
    int year = sc.nextInt();
    System.out.println((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? "leap": "normal");
  }
}

// REVISION
// 1. How to convert primitive types into wrapper classes? (Hint: using a method)
