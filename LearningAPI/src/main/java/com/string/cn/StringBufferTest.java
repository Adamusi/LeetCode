package com.string.cn;

import org.junit.Test;

/**
 * ClassName: StringBufferTest <br/>
 * Description: <br/>
 * date: 2021/11/29 21:08<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */
public class StringBufferTest {


    /**
      增： append(XXX)
      删： delete(int start, int end)
      改： setCharAt(int n, char ch) / replace(int start, int end, String str)
      查： charAt(int n)
      插： insert(int offset, xx)
     长度：length()
     遍历： for() + charAt() /toString()
    */
    @Test
    public void test() {
        StringBuffer sb = new StringBuffer("abc");
        sb.append(1);
        sb.append('1');
        System.out.println(sb);
        //sb.delete(2,4);//删除指定位置的内容
        sb.replace(2,4,"hello");//把[start,end]位置替换成str
        sb.insert(2,"false");//指定位置插入Xx
        sb.insert(2,false);
        sb.reverse();//当前字符串的反转

    }
}
