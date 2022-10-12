package com.example.demo.entity;

import com.glr.myjpa.annotation.MyCol;
import com.glr.myjpa.annotation.MyId;
import com.glr.myjpa.annotation.MyTable;
import lombok.Data;

/**
 * @description:
 * @author: cyx
 * @date: 2022-10-11
 **/
@MyTable(table = "user")
@Data
public class User {
    @MyCol(colName = "id")
    @MyId
    private Integer id;
    @MyCol(colName = "name")
    private String name;
    @MyCol(colName = "t_name")
    private String tName;
}
