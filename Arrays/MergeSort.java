public class MergeSort {

  public static void conquer(int arr[], int st, int md, int en) {
    int[] merge = new int[en - st + 1];

    int idx1 = st;
    int idx2 = md + 1;
    int x = 0;

    while (idx1 <= md && idx2 <= en) {
      if (arr[idx1] <= arr[idx2]) {
        merge[x++] = arr[idx1++];
      } else {
        merge[x++] = arr[idx2++];
      }
    }
    while (idx1 <= md) {
      merge[x++] = arr[idx1++];
    }
    while (idx2 <= en) {
      merge[x++] = arr[idx2++];
    }
    for (int i = 0, j = st; i < merge.length; i++, j++) {
      arr[j] = merge[i];
    }
  }

  public static void divide(int arr[], int st, int en) {
    if (st >= en) {
      return;
    }
    int md = st + (en - st) / 2;
    divide(arr, st, md);
    divide(arr, md + 1, en);
    conquer(arr, st, md, en);
  }

  public static void main(String[] args) {
    int[] arr = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
    int n = arr.length;

    divide(arr, 0, n - 1);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + "");
    }
    System.out.println();
  }
}
