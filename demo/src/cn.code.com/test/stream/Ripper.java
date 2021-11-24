package cn.code.com.test.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ClassName: Ripper <br/>
 * Description: <br/>
 * date: 2021/11/22 23:24<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */

public class Ripper {

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

            List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            list.add(map);
            list.add(map2);
            list.add(map3);
            list.add(map4);

            Stream<Map<String, Object>> stream = list.stream();

            List<Map<String, Object>> list2 = stream.sorted(Ripper::comparator).collect(Collectors.toList());
            for (Map<String, Object> m : list2) {
                System.out.println(m.get("name") + " " + m.get("age"));
            }
        }

        public static int comparator(Map<String, Object> map1, Map<String, Object> map2) {
            if (map1 == null && map2 == null)
                return 0;

            if (map1 == null || map2 == null) {
                throw new NullPointerException();
            }

            String name1 = (String) map1.get("name");
            String name2 = (String) map2.get("name");
            int c = name1.compareTo(name2);
            if (c != 0)
                return c;

            int age1 = (int) map1.get("age");
            int age2 = (int) map2.get("age");

            return age2 - age1;
        }

    }

