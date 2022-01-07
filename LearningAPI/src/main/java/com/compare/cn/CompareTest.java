package com.compare.cn;

import com.entity.cn.Goods;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: CompareTest <br/>
 * Description: <br/>
 * Comparable接口的方式一旦一定，保证Comparable接口实现类的对象在任何位置都可以比较大小
 * comparator接口属于临时性的比较
 * date: 2021/12/4 14:09<br/>
 * Comparable接口的使用：自然排序
 * Comparator接口的使用：定制排序
 */
public class CompareTest {
    @Test
    public void test0() {

        String[] arr = new String[]{"AA", "CC", "KK", "GG", "JJ", "DD"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    //指明商品比较大小的方式：按照产品名称从低到高排序; 按照价格从高到低排序;
    public void test1() {
        Goods[] arr2 = new Goods[4];
        arr2[0] = new Goods("zhangsan", 1);
        arr2[1] = new Goods("zhan", 210);
        arr2[2] = new Goods("zha", 100);
        arr2[3] = new Goods("zha", 120);
        Arrays.sort(arr2, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods && o2 instanceof Goods) {
                    Goods s1 = (Goods) o1;
                    Goods s2 = (Goods) o2;
                    if(s1.getName().equals(s2.getName())) {
                        return -Double.compare(s1.getPrice(),s2.getPrice());
                    } else{
                        return s1.getName().compareTo(s2.getName());
                    }
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr2));
    }

    //自然排序 ==  //指明商品比较大小的方式：按照价格从低到高排序;按照产品名称从低到高排序
    @Test
    public void test2() {
        Goods [] arr = new Goods[4];
        arr[0] = new Goods("zhangsan", 1);
        arr[1] = new Goods("zhan", 210);
        arr[2] = new Goods("zha", 100);
        arr[3] = new Goods("zh", 100);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
