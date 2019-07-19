package com.kwonyoon.springexample;

import java.util.Random;

import com.kwonyoon.springexample.entity.Point;
import com.kwonyoon.springexample.redis.PointDao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PointDaoTest {
    @Autowired
    PointDao pointDao;

    final String key = "point:1";
    Random rg = new Random();

    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            pointDao.add(key, Point.builder().x(rg.nextInt(100)).y(rg.nextInt(100)).build());
        }
        System.out.println(pointDao.get(key));
    }
}