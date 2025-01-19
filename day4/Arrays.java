import java.util.*;

class Arrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 5
    System.out.println("Enter no of rows1: ");
    int r1 = sc.nextInt();
    System.out.println("Enter no of cols1: ");
    int c1 = sc.nextInt();
    System.out.println("Enter no of rows2: ");
    int r2 = sc.nextInt();
    System.out.println("Enter no of cols2: ");
    int c2 = sc.nextInt();
    
    if (c1 == r2) {
      System.out.println("Enter elements in matrix 1: ");
      int[][] arr1 = new int[r1][c1];
      for(int i = 0; i < r1; i++) {
        for(int j = 0; j < c1; j++) {
          arr1[i][j] = sc.nextInt();
        }
      }
      System.out.println("Enter elements in matrix 2: ");
      int[][] arr2 = new int[r2][c2];
      for(int i = 0; i < r2; i++) {
        for(int j = 0; j < c2; j++) {
          arr2[i][j] = sc.nextInt();
        }
      }

      System.out.println("Multiply of two martix: ");
      int[][] arr3 = new int[r1][c2];
      for(int i = 0; i < r1; i++) {
        for(int j = 0; j < c2; j++) {
          int sum = 0;
          for(int k = 0; k < c1; k++) {
            sum += arr1[i][k] * arr2[k][i];
          }
          arr3[i][j] = sum;
        }
      }

      for(int i = 0; i < arr3.length; i++) {
        for(int j = 0; j < arr3[i].length; j++) {
          System.out.print(arr3[i][j]+" ");
        }
        System.out.println();
      }
    }
    else {
      System.out.println("not possible");
    }


  }
}