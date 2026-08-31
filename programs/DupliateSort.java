import java.util.*;

public class DupliateSort {
          public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];  
            int[] temp = new int[array.length];
            int j = 0;
            System.out.println("Enter the values for the array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }for (int i = 0; i < array.length-1; i++) {
               if(array[i] != array[i+1]){
                temp[j] = array[i];
                j++;
               }
            temp[j] = array[array.length -1];   
            }
            System.out.println("The array is:");
            for (int num : temp) {
                System.out.print(num + " ");
            }
        }
    
}
