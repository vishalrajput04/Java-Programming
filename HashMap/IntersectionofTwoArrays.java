import java.util.HashSet;
import java.util.Arrays;

class IntersectionofTwoArrays{
        public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        for (int x : result) {
          System.out.println(x);

        }
        
    }
}
