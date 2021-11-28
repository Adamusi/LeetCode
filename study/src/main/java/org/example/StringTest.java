package org.example;

/**
 * ClassName: StringTest <br/>
 * Description: <br/> 面试题目
 * date: 2021/11/28 23:14<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */
public class StringTest {

    String str1 = new String("123");
    char [] ch = {'t', 'e', 's', 't'};
    public void change(String str, char ch[]) {
        str1 = "456";
        ch[0] = 'b';
    }


    public static void main(String[] args) {
        StringTest s = new StringTest();
        s.change(s.str1, s.ch);
        System.out.println(s.str1);// 123
        System.out.println(s.ch);// best
    }
}
