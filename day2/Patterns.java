import java.util.Scanner;

class Patterns {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1 
    /*
            *****
            *****
            *****
    */

   System.out.println("Enter r: ");
   int r = sc.nextInt();
  //  System.out.println("Enter c: ");
  //  int c = sc.nextInt();
  //  for(int i = 0; i < r; i++) {
  //   for(int j = 0; j < c; j++) {
  //     System.out.print("* ");
  //   }
  //   System.out.println();
  //  }

   // ----------- 2 
    /*
            *****
            *   *
            *****
    */

  //  for(int i = 1; i <= r; i++) {
  //   if (i == 1 || i == r) {
  //     for (int k = 1; k <= c; k++) {
  //       System.out.print("*");
  //     }
  //   }
  //   else {
  //     System.out.print("*");
  //     for(int k = 2; k <= c - 1; k++) {
  //       System.out.print(" ");
  //     }
  //     System.out.print("*");
  //   }
  //   System.out.println();
  //  }


   // ----------- 3 
    /*
            *
            **
            ***
            ****
    */

  //  for(int i = 1; i <= r; i++) {
  //   for(int j = 1; j <= i; j++) {
  //     System.out.print("* ");
  //   }
  //   System.out.println();
  //  }

   // ----------- 4 
    /*
            ****
            ***
            **
            *
    */

  //  for(int i = 1; i <= r; i++) {
  //   for(int j = r; j >= i; j--) {
  //     System.out.print("* ");
  //   }
  //   System.out.println();
  //  }

   // ----------- 5, full pyramid
    /*
            *
           **
           ***
          ****
    */
  //  int j;
  //  for(int i = 1; i <= r; i++) {
  //   for(int k = 1; k <= r - i; k++) {
  //     System.out.print(" ");
  //   }
  //   for(j = 1; j<= i; j++) {
  //     System.out.print("* ");
  //   }
  //   for(int k = j; k < 2*r; k++) {
  //     System.out.print(" ");
  //   }
  //   System.out.println();
  //  }

   // ----------- 6, inverted full pyramid
    /*
          ****
           ***
           **
            *
    */
   int j;
   for(int i = 1; i <= r; i++) {
    int cols = r - i + 1;
    for(int k = 1; k <= r - cols; k++) {
      System.out.print(" ");
    }
    for(j = 1; j<= cols; j++) {
      System.out.print("* ");
    }
    for(int k = j; k < 2*r; k++) {
      System.out.print(" ");
    }
    System.out.println();
   }

    // ----------- 7, hollow full pyramid
    /*
          *
        *    *
        *    *
       * * * * *
    */
   int j;
   for(int i = 1; i <= r; i++) {
    if (i != r) {
      int spaces = r - i + 1;
      int cols = 2*r;
      for(int k = 1; k <= spaces; k++) {
        System.out.print(" ");
      }
      System.out.print("*");
      if (i != 1) {
        // print spaces between the stars
        for(int l = 1; l <= cols - (2*spaces); l++) {
          System.out.println(" ");
        }
        System.out.print("*");
      }
      for(int k = j; k < 2*r; k++) {
        System.out.print(" ");
      }
      System.out.println();
    }
    else {

    }
   }
  }
}