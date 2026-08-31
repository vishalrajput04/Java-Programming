public class QuickSort {

  public static int partitation(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    i++;
    int temp = arr[i];
    arr[i] = pivot;
    arr[high] = temp;
    return i;
  }

  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pvdx = partitation(arr, low, high);

      quickSort(arr, low, pvdx - 1);
      quickSort(arr, pvdx + 1, high);
    }

  }

  public static void main(String[] args) {
    int[] arr = { 1, 9, 2, 8, 3, 7, 4, 5, 6 };
    int n = arr.length;

    quickSort(arr, 0, n - 1);
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
