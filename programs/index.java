import java.util.Scanner;
public class index {
    public static int reverse(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max1 = arr[0];
        int max2 = arr[0];
        for (int i = 1; i < arr.length; i++) {    
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i] > max2){
                
            }
        } 
          return max2;
     }
    public static void main(String[] args) {
        System.out.println(reverse());
    }
}