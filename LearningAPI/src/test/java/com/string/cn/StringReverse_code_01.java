package com.string.cn;

/**
 * @description： 将字符串中提定部门进行反转。比如："abcdefg" 反转为"abfedcg"
 * @author： zhangzq
 * @date： 2021/12/1 20:01
 * @modifiedBy：
 * @version: 1.0
 */
public class StringReverse_code_01 {

    // 方式一： 转换为char[]
    public String reverse(String str, int startIndex, int endIndex) {
        if (null != str) {
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    // 方式二： 使用String的拼接
    public String reverse1(String str, int startIndex, int endIndex) {
        if (null != str) {
            // 第一部分的内容
            String strReverse = str.substring(0, 2);
            //  第二部分的内容
            for (int i = endIndex; i >= startIndex; i--) {
                strReverse += str.charAt(i);
            }
            // 第三部分的内容
            strReverse = str.substring(endIndex + 1);
            return strReverse;
        }
        return null;
    }

    // 方式二： 使用StringBuffer 和 StringBuilder的拼接
    public String reverse2(String str, int startIndex, int endIndex) {
        if (null != str) {
            StringBuffer build = new StringBuffer(str.length());
            // 第一部分的内容
            build.append(str.substring(0, startIndex));
            //  第二部分的内容
            for (int i = endIndex; i >= startIndex; i--) {
                build.append(str.charAt(i));
            }
            // 第三部分的内容
            build.append(str.substring(endIndex + 1));
            return build.toString();
        }
        return null;
    }


    public static void main(String[] args) {
        StringReverse_code_01 test = new StringReverse_code_01();
        String result = test.reverse("abcdefg", 2, 5);
        System.out.println(result);
    }
}
