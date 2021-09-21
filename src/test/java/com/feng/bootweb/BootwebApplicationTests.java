package com.feng.bootweb;

import com.feng.bootweb.bean.User;
import com.feng.bootweb.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootwebApplicationTests {
    @Autowired
UserMapper userMapper;
    @Test
    void contextLoads() {
        User user= userMapper.selectById(3000);
        System.out.println(user);
    }

}
