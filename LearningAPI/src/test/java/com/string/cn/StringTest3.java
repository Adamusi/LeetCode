package com.string.cn;

/**
 * @description： 获取两个字符串中最大相同子串。 例如：str1="abcwwwwdefo"; str2="abcwdefo" 短字符串与长字符串进行比较
 * @author： zhangzq
 * @date： 2021/12/1 20:01
 * @modifiedBy：
 * @version: 1.0
 */
public class StringTest3 {


    public String getMaxSameString(String str1, String str2) {
        if (null != str1 && null != str2) {
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = minStr.length();

            for (int i = 0; i < length; i++) {

                for (int x = 0, y = length; y <= length; x++, y++) {
                    String subStr = minStr.substring(x, y);
                    if (maxStr.contains(subStr)) {
                        return subStr;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        StringTest3 test = new StringTest3();
        String str = test.getMaxSameString("abcdwdefo", "abcd");
        System.out.println(str);
    }
}
