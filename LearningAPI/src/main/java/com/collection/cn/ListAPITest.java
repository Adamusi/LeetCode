package com.collection.cn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ClassName: TestList <br/>
 * Description: <br/>
 * date: 2021/11/24 22:59<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */
public class ListAPITest {

    public static void main(String[] args) {

        // 集合删除的问题
        List<String> list = new ArrayList<>();

        list.add("123");
        list.add("234");
        list.add("abc");

        // 删除集合中的哥 abc的元素
        //list.remove("123");
        list.remove(1);
        // 条件删除
        list.removeIf(t-> "abc".equals(t));
        System.out.println(list);
        // 集合删除的问题
        List<Integer> list2 = new ArrayList<>();
        list2.add(1000);
        // Integer 通过 equals 进行删除
        list2.remove(Integer.valueOf(1000));

        // 集合排序
        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(1);
        list3.add(2);
        //list3.add(null);
        // 降序
        //list3.sort(Comparator.nullsFirst(Comparator.reverseOrder()));
        // 升序
        //list3.sort(Comparator.nullsFirst(Comparator.naturalOrder()));

        list3.sort((a,b) -> a.compareTo(b));
        System.out.println(list3);
    }

}
