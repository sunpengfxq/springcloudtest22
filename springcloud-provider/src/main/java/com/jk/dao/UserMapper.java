package com.jk.dao;

import com.jk.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;


public interface UserMapper {

    @Select("select * from springcloud_user")
    List<User> selectUser();
}
