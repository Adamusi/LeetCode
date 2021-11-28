package org.example;

import org.junit.Test;
import sun.rmi.rmic.Main;

/**
 * ClassName: StringTest <br/>
 * Description: <br/>
 * date: 2021/11/28 21:05<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */
public class StringTest {


    @Test
    public void test0() {
        String str1 = "helloworld";
        boolean b1 = str1.endsWith("rld"); // 测试字符串是否以指定的后缀结束
        System.out.println(b1);

        boolean b2 = str1.startsWith("He"); // 测试字符串是否以指定的前缀开始
        boolean b3 = str1.startsWith("ll", 2); // 测试字符串从指定索引开始的子字符串是否以指定前缀开始
        System.out.println(b2);
    }

    @Test
    public void test1() {
        String str1 = "helloworld";
        boolean b1 = str1.endsWith("rld"); // 测试字符串是否以指定的后缀结束
        System.out.println(b1);

        boolean b2 = str1.startsWith("He"); // 测试字符串是否以指定的前缀开始
        boolean b3 = str1.startsWith("ll", 2); // 测试字符串从指定索引开始的子字符串是否以指定前缀开始
        System.out.println(b2);
    }


    @Test
    public void test2() {
        String str1 = "北京你好";
        boolean b1 = str1.endsWith("rld"); // 测试字符串是否以指定的后缀结束
        System.out.println(b1);

        boolean b2 = str1.startsWith("He"); // 测试字符串是否以指定的前缀开始
        boolean b3 = str1.startsWith("ll", 2); // 测试字符串从指定索引开始的子字符串是否以指定前缀开始
        System.out.println(b2);
    }


    @Test
    public void test3() {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello" + "world";
        String str4 = str1 + "world";
        String str5 = str1 + str2;
        String str6 = (str1 + str2).intern();

        System.out.println(str3 == str4);
        System.out.println(str3 == str5);
        System.out.println(str4 == str5);
        System.out.println(str3 == str6);
    }


    @Test
    public void test4() {
        String str1 = "123";
        int num = Integer.parseInt(str1);
        String str2 = String.valueOf(num);
        String str3 = num + "";
        System.out.println(str1 == str3);// false
    }
}
