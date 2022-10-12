package com.example.demo.dao;

import com.example.demo.entity.User;
import com.glr.myjpa.annotation.MyMapper;
import com.glr.myjpa.dao.BaseDao;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: cyx
 * @date: 2022-10-11
 **/
@MyMapper
public interface Userdao extends BaseDao<User,Integer> {

}
