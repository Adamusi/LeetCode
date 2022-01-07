package com.date.cn;

;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * ClassName: DateTimeTest <br/>
 * Description: <br/>
 * date: 2021/11/29 22:04<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */
public class DateTimeTest {

    /**
     * java.util.Date类
     * ---- java.sql.Date类
     * 1. 两个构造器的使用
     * 构造器一： Date() :创建一个对应当前的Date对象
     * 构造器二： 创建指定毫秒数的Date()对象
     * 2. 两个方法的使用
     * toString():显示当前的年、月、日、时、分、秒
     * getTime(): 获取当前Date()对象的时间戳
     */

    @Test
    public void test0() {
        // now():获取当前的日期： 时间、日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);

        //of():设置指定的年、月、日、时、分、秒。没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2021,12,4,20,39,17,88);
        System.out.println(localDateTime1);

        // 体现不可变性
        LocalDate localDate1 = localDate.withDayOfMonth(11);
        System.out.println(localDate);
        System.out.println(localDate1);



    }

}
