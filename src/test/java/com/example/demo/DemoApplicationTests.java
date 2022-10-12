package com.example.demo;

import com.example.demo.dao.Userdao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.glr.myjpa.annotation.MyTransactional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private Userdao userdao;

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setName("欢欢");
        List<User> select = userdao.select(user);
        System.out.println(select);
        int i = userdao.deleteById(34);
        System.out.println(i);
        User user1 = userdao.selectById(35);
        user1.setName("凌晴");
        userdao.updateById(user1);
    }

}
