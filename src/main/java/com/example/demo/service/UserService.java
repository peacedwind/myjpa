package com.example.demo.service;

import com.example.demo.dao.Userdao;
import com.example.demo.entity.User;
import com.glr.myjpa.annotation.MyTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: cyx
 * @date: 2022-10-12
 **/
@Service
public class UserService {

    @Resource
    private Userdao userdao;


    @MyTransactional
    public void test111(){
        User entity = new User();
        entity.setName("欢欢111");
        entity.setTName("欢欢t");
        userdao.insert(entity);
        userdao.insert(entity);
        User user = userdao.selectById(entity.getId());
        System.out.println(user);

    }
}
