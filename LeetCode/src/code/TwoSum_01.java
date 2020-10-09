package code;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张自强
 * @date 2020-10-9 21:23:09
 *  1. Two Sum 题意：返回数组中和为给定数的下标 难度：Easy 分类：Array,
 *  HashTable 算法：题目说明了数组中一定有解，且解唯一，所以用哈希表记录已遍历的元素即可
   *    给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标
 */

public class TwoSum_01 {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 17;

		int[] r = twoSum(nums, target);
		System.out.println(r[0]);
		System.out.println(r[1]);
	}

	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[] { map.get(target - nums[i]), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
