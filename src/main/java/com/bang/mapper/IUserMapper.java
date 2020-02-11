package com.bang.mapper;

import com.bang.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserMapper {

   Integer  addUser(@Param("user") User user);

   List<User> getUserById(@Param("user") User user);
}
