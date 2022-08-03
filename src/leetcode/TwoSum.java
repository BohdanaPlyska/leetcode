package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // nums = [2, 7, 11, 15] target = 9  => [0,1]

        for( int i = 0; i < nums.length; i ++) {
            for (int j = i + 1; i < nums.length; j++) {
                int k = nums[i] + nums[j];
                if(k == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }

    public static  int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> num_map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(num_map.containsKey(complement)) {
                return new int[] { num_map.get(complement), i};
            }

            num_map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found");
    }

    public static void main (String[] args) {
        int [] array =  {2, 7, 11, 15};
        System.out.println(twoSumHashMap(array,9));
    }


}
