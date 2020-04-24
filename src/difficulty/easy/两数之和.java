package difficulty.easy;

import java.util.HashMap;

/**
 * Description:
 * User: jerry
 * DateTime: 2020-04-24 9:26
 */
public class 两数之和 {
    public static void main(String[] args) {
        int[] param = new int[]{2, 7, 11,15};
        //int[] result1 = twoSum1(param, 6);
        //int[] result2 = twoSum2(param, 6);
        int[] result3 = twoSum3(param, 9);
    }

    // region 写法1－自己的写法
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            int position = searchIndex(nums, diff);
            if (position >= 0 && position != i) {
                return new int[]{i, position};
            }
        }
        return null;
    }

    private static int searchIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    // endregion

    // region 写法2－官方的暴力写法

    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // endregion

    // region 写法3－精选写法

    public static int[] twoSum3(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    //endregion
}
