public class Matrix_print {
  public static void main(String[] args) {
    int row = 3;
    int col = 4;
    int[][] matrix = new int[row][col];
    matrix = new int[][] { { 1, 2, 3, 4 },
        { 4, 3, 2, 1 },
        { 1, 2, 3, 4 }
    };
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}