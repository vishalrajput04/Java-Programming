import java.util.*;

class Searching {

  int search() {
    int key = 5;
    int value = 0;
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
        value = i;
      }
    }
    return value;
  }
}

public class Linear_search {
  public static void main(String[] args) {
    Searching obj = new Searching();
    System.out.println(obj.search());
  }
}