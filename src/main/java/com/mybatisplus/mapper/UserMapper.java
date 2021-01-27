package com.mybatisplus.mapper;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: UserMapper
 * DATE: 2021/1/27
 * TIME: 0:53
 * JDK 11
 */

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.mybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/27
 * @Time 0:53
 * @Version v1.0
 **/
//@Mapper
@Repository //记得加上这个注解，不然，@Autowired会报红，但是可以查询数据
public interface UserMapper extends BaseMapper<User> {

//    @Select("selectUserList")
    List<User> selectUserList();

}
