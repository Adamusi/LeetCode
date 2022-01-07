package com.leedcode.cn.demo1;

import java.util.Arrays;

/**@author zzq
 * @date  2020-10-11 20:17:30
 * @version 1.0 
 * @parameter  
 * @description  数组元素的添加
 * @return 
 */

public class TestAddArray {

	public static void main(String[] args) {
		//解决数组的长度不可变的问题
		int[] arr = new int[] {9,8,7};
		//快速查看数组中的元素
		System.out.println(Arrays.toString(arr));
		//要加入数组的目标元素
		int dst=6;
		
		//创建一个新的数组，长度是原数组长度+1
		int[] newArr = new int[arr.length+1];
		//把原数组中的数据全部复制到新数组中
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		//把目标元素放入新数组的最后
		newArr[arr.length] = dst;
		//新数组替换原数组
		arr = newArr;
		System.out.println(Arrays.toString(arr));
	}

}
