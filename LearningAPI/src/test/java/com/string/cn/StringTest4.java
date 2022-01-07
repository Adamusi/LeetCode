package com.string.cn;

import java.util.Arrays;

/**
 * @description： 获取两个字符串中最大相同子串。 例如：str1="abcwwwwdefo"; str2="abcwdefo" 短字符串与长字符串进行比较
 * @author： zhangzq
 * @date： 2021/12/1 20:01
 * @modifiedBy：
 * @version: 1.0
 */
public class StringTest4 {


    public String [] getMaxSameString(String str1, String str2) {
        if (null != str1 && null != str2) {
            StringBuffer SBuffer = new StringBuffer();
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = minStr.length();

            for (int i = 0; i < length; i++) {

                for (int x = 0, y = length; y <= length; x++, y++) {
                    String subStr = minStr.substring(x, y);
                    if (maxStr.contains(subStr)) {
                        SBuffer.append(subStr +",");
                    }
                }
                if(SBuffer.length() !=0) {
                    break;
                }
            }
            String [] split = SBuffer.toString().replaceAll(",", "").split("\\,");
            return split;
        }
        return null;
    }

    public static void main(String[] args) {
        StringTest4 test = new StringTest4();
        String[] str = test.getMaxSameString("abcwwwwdefo", "ab");
        System.out.println(Arrays.toString(str));
    }
}
