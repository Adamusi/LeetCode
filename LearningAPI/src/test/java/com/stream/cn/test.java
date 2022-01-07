package com.stream.cn;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: test <br/>
 * Description: <br/>
 * date: 2021/12/21 22:58<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */
public class test {
    public static void main(String[] args) {
        String s = "a,b";
        if(s.contains(","))
        {
            String[] split = s.split(",");
            List<String> x = Arrays.asList(split);
            System.out.println(x);
        }
    }
}
