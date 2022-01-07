package com.collection.cn;

import com.entity.cn.Person;
import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionAPITest <br/>
 * Description: <br/>
 * date: 2021/12/4 21:54<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */
public class CollectionAPITest {

    @Test
    public void test0() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("zhangsan", 100, 18, "男", "beijing"));
        coll.add(new Person("wangwu", 1000, 18, "男", "jinan"));
        coll.add(false);

        //1. contains(Object obj)：判断当前集合中是否包含obj  会调用obj对象所在类的equals()
        boolean contains = coll.contains(123);
        System.out.println(contains);

        //2. containsAll(Collection coll1):判断形参coll1中的所有元素是否都存在于当前集合中
        Collection coll1 = Arrays.asList(123, 456);
        System.out.println(coll.containsAll(coll1));

        //3. remove(Object obj)：从当前集合中移除obj元素
        boolean remove = coll.remove(123);
        System.out.println(remove);

        //4. removeAll(Collection coll1):从当前集合中移除coll1中所有的元素====差集
        Collection coll2 = Arrays.asList(123, 456);
        coll.removeAll(coll2);
        System.out.println(coll);

        //5. retainAll(Collection coll1):获取当前集合和coll1集合的交集，并返回给coll
        Collection coll3 = Arrays.asList(123, 456);
        coll.retainAll(coll3);
        System.out.println(coll);

        //6. 获取hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());

        //7. 集合转数组： toArray()
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //8. 数组转集合：
        List<String> list = Arrays.asList(new String[]{"AA", "BB"});
        System.out.println(list);


        List<Integer> list2 = Arrays.asList(123, 456);
        System.out.println(list2);

        //9. 集合遍历： 集合对象每次调用iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一元素之前
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {//hasNext()：判断是否还有下一个元素
            System.out.println(iterator.next()); //next: 1.指针下移 2.将下移以后元素位置上的元素返回

        }
    }

    @Test
    public void test1() {
        //10. 测试iterator的remove()
        // 删除集合
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add("Tom");
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if ("Tom".equals(obj)) {
                it.remove();
            }
        }

        //遍历集合
        it = coll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

   @Test
   public void test2() {
      //练习题
      String[] arr = new String[]{"MM", "MM"};

      //方式一：普通for循环
//      for (int i = 0; i < arr.length; i++) {
//         arr[i] ="GG";
//      }

      //方式二：增强for循环
      for (String s : arr) {
         s = "GG";
      }

         for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
         }
      }
}
