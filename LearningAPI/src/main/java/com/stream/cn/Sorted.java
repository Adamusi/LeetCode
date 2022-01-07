package com.stream.cn;

import java.util.*;
import java.util.stream.Collectors;

/**
 * ClassName: test <br/>
 * Description: <br/>
 * 主要首先是stream了，list.stream()这里是把map的List集合变成map的流
 * 然后就是Test::comparingByName这种中间加::表示方法引用
 * 其次就是关键的stream.sorted()方法，参数是传一个比较器Comparator，这里由JDK自带的Comparator.comparing工具方法可以帮你构建一个按照xx属性进行比较的比较器，默认是升序
 * 然后是比较器Comparator支持thenComparing方法，表示按照一定的比较顺序把各个比较连接起来比较
 * 其次是比较器Comparator的reversed方法，可以让比较器的原始顺序逆序，这也正好满足题主需要按照age逆序排列的要求
 * 最后就是collect()方法，把流的数据按照一定的方式收集起来，参数是一个收集器collector，这里用的是JDK自带的工具方法Collectors.toList把流的数据收集为集合
 * date: 2021/11/22 22:02<br/>
 * @author Administrator<br />
 * @since JDK 11
 */
public class Sorted {
    public static void main(String[] args) {


                Map<String, Object> map = new HashMap<String, Object>();
                map.put("name", "ZK");
                map.put("age", 13);

                Map<String, Object> map2 = new HashMap<String, Object>();
                map2.put("name", "ZA");
                map2.put("age", 15);

                Map<String, Object> map3 = new HashMap<String, Object>();
                map3.put("name", "CX");
                map3.put("age", 20);

                Map<String, Object> map4 = new HashMap<String, Object>();
                map4.put("name", "CX");
                map4.put("age", 18);

                List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
                list.add(map);
                list.add(map2);
                list.add(map3);
                list.add(map4);

                // 排序代码如下
                List<Map<String, Object>> collect = list.stream().sorted(Comparator.comparing(Sorted::comparingByName)
                        .thenComparing(Comparator.comparing(Sorted::comparingByAge).reversed()))
                        .peek(System.out::println)
                        .collect(Collectors.toList());
            }

            private static String comparingByName(Map<String, Object> map){
                return (String) map.get("name");
            }

            private static Integer comparingByAge(Map<String, Object> map){
                return (Integer) map.get("age");
            }
    }
