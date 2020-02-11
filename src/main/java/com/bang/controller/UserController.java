package com.bang.controller;

import com.bang.entity.User;
import com.bang.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService service;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String addUser(User user) {
        log.debug("进来咯");
        Integer i = service.addUser(user);
        log.debug("获得id"+i);
        return "ok";
    }
    @RequestMapping(value = "/select",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User getUserById(@RequestBody User user){
        log.debug("即将查询");
        List<User> list = service.getUserById(user);
        return list.get(0);
    }
}
