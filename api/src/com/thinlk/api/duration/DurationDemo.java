package com.thinlk.api.duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDemo {
    public static void main(String[] args) {
        //public static Duration between(开始时间,结束时间)  计算两个“时间"的间隔

        LocalDateTime fromDate = LocalDateTime.of(2021, 1, 1, 14, 15, 30);
        LocalDateTime toDate = LocalDateTime.of(2021, 3, 31, 18, 30, 59);
        Duration between = Duration.between(fromDate, toDate);
        System.out.println(between);
        //toSeconds() 为jdk9以后才出现的方法。
        //toMillis() 把时间转化成微妙
        System.out.println(between.toMillis());
        //toNanos()把时间转化成纳秒
        System.out.println(between.toNanos());

    }
}
