package question001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * TwoSum
 *
 * @author Zoey
 * @date 2019/03/12 06:49
 * @email 571002217@qq.com
 * @description
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] a =new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum.twoSum2(a,9)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0;j<nums.length;j++) {
                if(nums[i]+nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums,int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            }
            map.put(target-nums[i],i);
        }
        return result;
    }
}
