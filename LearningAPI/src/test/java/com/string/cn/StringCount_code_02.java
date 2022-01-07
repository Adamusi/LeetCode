package com.string.cn;

/**
 * @description： 获取一个字符串在另一个字符串中出现的次数
 * @author： zhangzq
 * @date： 2021/12/1 20:01
 * @modifiedBy：
 * @version: 1.0
 */
public class StringCount_code_02 {


    public int getCount(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if(mainLength >= subLength) {
            //
            while((index = mainStr.indexOf(subStr,index))!= -1) {
                count++;
                mainStr = mainStr.substring(index + subStr.length());
            }
            return count;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        StringCount_code_02 test = new StringCount_code_02();
        int count = test.getCount("abcabca","abc");
        System.out.println(count);
    }
}
