package com.ghh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = Provider8001.class)
public class WebAppTest {
    @Test
    public void test(){
        System.out.println("123");
    }

}

