package cn.edu.bjut.springbootproject1;

import cn.edu.bjut.springbootproject1.entity.User;
import cn.edu.bjut.springbootproject1.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest // springboot整合单元测试的注解
class SpringbootProject1ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println("hello world");
    }

    @Test
    public void testListUser(){
        List<User> userList = userMapper.list();
        userList.stream().forEach(user -> {
            System.out.println(user);
        });
    }

}
