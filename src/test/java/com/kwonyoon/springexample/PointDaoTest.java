package com.kwonyoon.springexample;

import com.kwonyoon.springexample.entity.Point;
import com.kwonyoon.springexample.redis.PointDao;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
public class PointDaoTest {
    @Autowired
    PointDao pointDao;

    final String key = "point:1";
    Random rg = new Random();

    @BeforeEach
    public void startUp(){
        pointDao.del(key);
    }

    @AfterEach
    public void tearDown(){
        pointDao.del(key);
    }

    @Test
    public void test() {
        int totalSize = 10;
        for (int i = 0; i < totalSize; i++) {
            pointDao.add(key, Point.builder().x(rg.nextInt(100)).y(rg.nextInt(100)).build());
        }
        System.out.println(pointDao.get(key));
        Assert.assertEquals(totalSize, pointDao.get(key).size());
    }
}