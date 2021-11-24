package cn.code.com.test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: filterCode <br/>
 * Description: <br/>
 * date: 2021/11/21 22:00<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */
public class filterCode {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add(null);
        // 获取 集合中大于 "cax" 字符串
        // stream流 支持链式调用
        List<String> collect = list.stream().filter(s -> null != s && "cax".compareTo(s) < 0).
                collect(Collectors.toList());
        System.out.println(collect);
    }
}
