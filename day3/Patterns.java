import java.util.*;
 
class Patterns {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // ----------- 7, hollow full pyramid
    /*
          *
        *    *
        *    *
       * * * * *
    */
  //  System.out.println("Enter r: ");
  //  int r = sc.nextInt();


   // ----------- 8, half pyramid using numbers
    /*
          1
          1 2
          1 2 3
          1 2 3 4
    */
  //  for(int i = 1; i <= r; i++) {
  //   for(int j = 1; j <= i; j++) {
  //     System.out.print(j +" ");
  //   }
  //   System.out.println();
  //  }

   // ----------- 9, pascal triangle
    /*
              1
             1 1
            1 2 1
           1 3 3 1 
          1 4 6 4 1
    */
  // ---------- Type 1: given row and col find the number at this position
    System.out.println("Enter row: ");
    int row = sc.nextInt();
    // System.out.println("Enter cols: ");
    // int col = sc.nextInt();
    // System.out.println(findNumberAtPlace(row-1, col-1));

    // --------- Type 2: Given N, give the entire row for this n

    // brute force - for each row, find the number at each row and cols - o(n*r)
    // for(int i = 0; i < row; i++) {
    //   System.out.print(findNumberAtPlace(row - 1, i) + " ");
    // }

    // optimized approach - O(n)
    // System.out.println(Arrays.toString(findCompleteRow(row-1)));

    // Type 3 - print the entire pascals triangle

    // brute force ----- not working
    // ArrayList<ArrayList<Integer>> outerlist = new ArrayList<>();
    // for(int i = 1; i <= row; i++) {
    //   int[] temp = new int[i];
    //   for(int j = 1; j <= i; j++) {
    //     temp[j-1] = findNumberAtPlace(i-1,j-1);
    //   }
    //   outerlist.add(Arrays.asList(temp));
    // }
    // for(int i = 0; i < outerlist.size(); i++) {
    //   System.out.println(outerlist.get(i));
    // }

    // optimized 
    for(int i = 1; i <= row; i++) {
      System.out.println(Arrays.toString(findCompleteRow(i)));
    }
    
  }

  static int findNumberAtPlace(int row, int col) {
    int res = 1;
    for(int i = 0; i < col; i++) {
      res = res * (row - i);
      res = res / (i+1);
    }
    return res;
  }

  static int[] findCompleteRow(int rownumber) {
    int res = 1;
    int[] ans = new int[rownumber];
    for(int i = 1; i <= rownumber; i++) {
      ans[i-1] = res;
      res = res * (rownumber - i);
      res = res / (i);
    }
    return ans;
  }
}