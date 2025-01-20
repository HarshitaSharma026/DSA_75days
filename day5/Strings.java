import java.util.*;
import java.lang.Character;
class Strings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1. occurance of a character in a string
    // System.out.println("Enter string: ");
    // String s = sc.next();
    // System.out.println("Enter character: ");
    // char ch = sc.next().charAt(0);
    // int count = 0;
    // for(int i = 0; i < s.length(); i++) {
    //   if (s.charAt(i) == ch) {
    //     count++;
    //   }
    // }
    // System.out.println("count: " + count);

    // 2. number of vowels, consonats, digits, and white spaces
    // System.out.println("Enter string: ");
    // String s = sc.nextLine();
    // int vowels = 0, consonants = 0, digits = 0, white = 0;
    // for(int i = 0; i < s.length(); i++) {
    //   if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
    //     vowels++;
    //   }
    //   else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
    //     digits++;
    //   }
    //   else if (s.charAt(i) == ' ') {
    //     white++;
    //   }
    //   else {
    //     consonants++;
    //   }
    // }
    // System.out.println("Vowel: " + vowels +", Consonants: " + consonants + ", digits: " + digits + ", white spaces: " + white);


    // 3. remove all characters except aplhabets
    // System.out.println("Enter string: ");
    // String s = sc.next();
    // StringBuilder sb = new StringBuilder();
    // for(int i = 0; i < s.length(); i++) {
    //   if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
    //     sb.append(s.charAt(i));
    //   }
    // }
    // System.out.println(sb);

    // 4. change every letter wiht its successor
    // System.out.println("Enter string: ");
    // String s = sc.next();
    // StringBuilder sb = new StringBuilder();
    // for(int i = 0; i < s.length(); i++) {
    //   if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
    //     sb.append((char) (s.charAt(i) + 1));
    //   }
    //   else {
    //     sb.append(s.charAt(i));
    //   }
      
    // }
    // System.out.println(sb);

    // 7. String palindrome 
    // System.out.println("Enter string: ");
    // String s = sc.next();
    // System.out.println(isPalindrome(s));

    // 8. Count number of words in a string
    // System.out.println("Enter string: ");
    // String s = sc.nextLine();
    // int count = 0;
    // boolean inWord = false;
    // for(int i = 0; i < s.length(); i++) {
    //   char ch = s.charAt(i);
    //   if (Character.isWhitespace(ch)) {
    //     inWord = false;
    //   }
    //   else {
    //     if (!inWord) {
    //       count++;
    //       inWord = true;
    //     }
    //   }
    // }
    // System.out.println(count);

    // 9. Capitalize first letter of each word in a string
    // System.out.println("Enter string: ");
    // StringBuilder sb = new StringBuilder(sc.nextLine());
    // boolean inWord = false;

    // for(int i = 0; i < sb.length(); i++) {
    //   char ch = sb.charAt(i);
    //   if (Character.isWhitespace(ch)) {
    //     inWord = false;
    //   }
    //   else {
    //     if (!inWord) {
    //       sb.setCharAt(i, Character.toUpperCase(ch));
    //       inWord = true;
    //     }
    //   }
    // }
    // System.out.println(sb);

    // 10. Find largest word in a string
    System.out.println("Enter string: ");
    String s = sc.nextLine();
    String[] arr = s.trim().split(" ");
    String str = "";
    int maxLength = 0;
    for(int i = 0; i < arr.length; i++) {
      if (arr[i].length() > maxLength) {
        maxLength = arr[i].length();
        str = arr[i];
      }
    }
    System.out.println(str);
  }

  static boolean isPalindrome(String s) {
    int start = 0, end = s.length() - 1;
    while (start <= end) {
      if (s.charAt(start) != s.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
}