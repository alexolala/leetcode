import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[]{-1, -1};

        if (nums == null || nums.length < 2) {
            return res;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{ map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
