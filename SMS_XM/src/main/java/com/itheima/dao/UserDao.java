package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {

    @Insert("insert into user values(#{id},#{username},#{age})")
    public int addUser(User user);

    @Delete("delete from user where id=#{id}")
    public int deleteUserById(String id);

    @Update("update user set username=#{username},age=#{age} where id=#{id}")
    public int updateUser(User user);

    @Select("select * from user where id=#{id}")
    User findUserById(String id);

    @Select("select * from user")
    List<User> findAllUsers();


}
