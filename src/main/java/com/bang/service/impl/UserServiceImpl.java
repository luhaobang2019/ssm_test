package com.bang.service.impl;

import com.bang.entity.User;
import com.bang.mapper.IUserMapper;
import com.bang.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
     private IUserMapper userMapper;
    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public List<User> getUserById(User user) {
        return userMapper.getUserById(user);
    }
}
