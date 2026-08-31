import java.util.*;

public class BuySell {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key element in array:");
        int key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Element found at Index : " + i);
                return;
            }
        }
        System.out.println("Element Not found");
    }
}
