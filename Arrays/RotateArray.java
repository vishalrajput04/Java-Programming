class RotateArray{
    public static void reverse(int[] reArr, int left, int right){
        while (left < right){
            int temp = reArr[left];
            reArr[left] = reArr[right];
            reArr[right] = temp;
            left++;
            right--;
        }

    }
    public static void main(String [] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int n = nums.length;
        int k=3;
        k = k % n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

        for(int i=0; i<n; i++){
          System.out.print(nums[i]);
        }
    }
}