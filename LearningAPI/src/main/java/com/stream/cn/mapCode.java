package com.stream.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ClassName: mapCode <br/>
 * Description: <br/>
 * date: 2021/11/21 22:01<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */
public class mapCode {

    public static void main(String[] args) {

        List<Map<String, Object>> listAll = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("chinese",80);
        map.put("english",70);
        map.put("math",84);
        listAll.add(map);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("name","wangwu");
        map1.put("chinese",80);
        map1.put("english",70);
        map1.put("math",84);
        listAll.add(map1);


        // map : 做数据映射的 特点： 原集合的长度 和映射后集合的长度一致，且每条记录和原记录有一定的关系
        listAll.stream().map(m-> {
            Map<String, Object> mapList = new HashMap<>();
            mapList.put("name", m.get("name"));
            //转成 Integer
            Integer chinese = Integer.parseInt(String.valueOf(m.get("chinese")));
            Integer english = Integer.parseInt(String.valueOf(m.get("english")));
            Integer math = Integer.parseInt(String.valueOf(m.get("math")));
            mapList.put("sum",chinese + english + math);
            return mapList;
        }).peek(System.out::println) // peek 是一个中间过程，主要用于代码调试，出现在链的尾部是不会执行的。
                .collect(Collectors.toList());
    }
}
