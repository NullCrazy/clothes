package com.cloth.clothes.dao;

import com.cloth.clothes.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM user")
    List<User> selectUser();
}
