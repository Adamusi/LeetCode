package com.leedcode.cn.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zzq
 * @date 2020-10-9 21:23:09
       哈希查找
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
			  // 哈希查找 - O(1)
			if (map.containsKey(target - nums[i])) {
				return new int[] { map.get(target - nums[i]), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
