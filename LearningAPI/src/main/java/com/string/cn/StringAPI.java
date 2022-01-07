package com.string.cn;

/**
 * ClassName: StringAPITest <br/>
 * Description: <br/>
 * date: 2021/11/30 23:02<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */
public class StringAPI {

        String str1 = new String("123");
        char [] ch = {'t', 'e', 's', 't'};
        public void change(String str, char ch[]) {
            str1 = "456";
            ch[0] = 'b';
        }


        public static void main(String[] args) {
            StringAPI s = new StringAPI();
            s.change(s.str1, s.ch);
            System.out.println(s.str1);// 123
            System.out.println(s.ch);// best
        }
    }

