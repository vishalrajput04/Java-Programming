public class ReverseArray {
  public static void reverse(int[] arr){
    int n = arr.length;
    int left = 0;
    int right = n-1;
    while(left < right){
      int temp =  arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }

  }
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };
    reverse(nums);
    for(int i=0; i<nums.length; i++){
    System.out.print(nums[i]);
  }
}
}
