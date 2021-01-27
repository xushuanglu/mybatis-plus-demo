package com.mybatisplus.controller;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: UserController
 * DATE: 2021/1/27
 * TIME: 11:10
 * JDK 11
 */

import com.mybatisplus.entity.User;
import com.mybatisplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/27
 * @Time 11:10
 * @Version v1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUserList")
    public String getUserList(){
        List<User> userList = userMapper.selectUserList();
        return userList.toString();
    }
}
