class test {
  int matrix(int row, int col) {
    int[][] arr = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    return 0;
  }
}

public class Matrix {
  public static void main(String[] args) {

    test obj = new test();
    obj.matrix(3, 4);

  }
}