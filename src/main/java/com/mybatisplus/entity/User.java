package com.mybatisplus.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName User
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/27
 * @Time 0:55
 * @Version v1.0
 **/
@Data
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private Date create_time;
}
