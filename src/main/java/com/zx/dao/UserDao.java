package com.zx.dao;


import com.zx.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {

    //验证登录
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
