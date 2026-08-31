import java.util.Scanner;

public class Plusone {

    public static void main(String[] args) {
      
        
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length-1; i>=0; i--){
            if(arr[i]==9){
                arr[i] = 0;
            }else{
                arr[i]++;
                
            }
            System.out.println(arr[i]);
        }
        
    }
}