package com.leedcode.cn.Array;

/**@author zzq
 * @date  2021-2-21 18:35:24
 * @description  盛水最多的容器
 */

public class maxArea_011 {
     
	public static void main(String[] args) {
	
		int [] array = {1,8,6,2,5,4,8,3,7};		
		int res = maxArea(array);
		int res2 = maxArea2(array);
		System.out.println("res的值=" + res);
		System.out.println("res2的值=" + res2);
		
	}
	// -- 1.暴力法 时间复杂度O(n^2)
	private static int maxArea(int[] height) {		
		int res = 0;
		for(int i = 0;i<height.length; i++) {
			for(int j = i+1; j<height.length; j++) {
				//容器可以容纳水的容量=两条垂直线中最短的那条*两条线之间的距离
				int temp = Math.min(height[i],height[j]) * (j-i);
			    res = Math.max(res,temp);
			}
		}
		return res;
	}
	

	/*-- 2.双指针 时间复杂度O(n)
	 * 求出当前双指针对应的容器的容量；
             对应数字较小的那个指针以后不可能作为容器的边界了，将其丢弃，并移动对应的指针。
	 */
	private static int maxArea2(int[] height) {
		int res = 0;
		int resource = 0;
		int last = height.length - 1;
		while(resource < last) {
			if(height[resource] >= height[last]) {
				res = Math.max(res, height[last]*(last - resource));
				last-- ;
			} else {
				res = Math.max(res, height[resource]*(last - resource));
				resource++;
			}	
		}
		return res;		
	}
}

