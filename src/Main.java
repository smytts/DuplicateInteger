import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 3};
        hasDuplicate(nums);
        int[] nums2 = new int[]{1, 2, 3, 4};
        hasDuplicate(nums2);
        int[] nums3 = new int[]{1, 2, 3, 4, 2, 1};
        hasDuplicate(nums3);
    }
}