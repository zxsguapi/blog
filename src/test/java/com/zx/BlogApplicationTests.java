package com.zx;

import com.zx.pojo.User;
import com.zx.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        User user = userService.checkUser("magua", "123");
        System.out.println(user);
    }

}
