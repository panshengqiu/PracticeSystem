package cn.edu.bjut;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest // springboot整合单元测试的注解
class SpringbootProject1ApplicationTests {
    @Test
    void contextLoads() {
        System.out.println("hello world");
    }

    @Test
    void test(){
        System.out.println("1");
    }
}
