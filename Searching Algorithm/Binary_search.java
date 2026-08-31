public class Binary_search {

  public static void binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    int mid;

    while (start <= end) {
      mid = (start + end) / 2;
      if (target == arr[mid]) {
        System.out.println("Found at idx : " + mid);
        return;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    System.out.println("Not found");
  }

  public static void main(String[] args) {
    int[] arr = { 5, 10, 15, 20, 25, 30, 35 };
    int target = 35;
    binarySearch(arr, target);
  }
}