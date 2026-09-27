import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 20};

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                System.out.println(true);
                return;
            }
            set.add(num);
        }
        System.out.println(false);
    }
}
