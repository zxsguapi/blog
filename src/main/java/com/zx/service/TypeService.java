package com.zx.service;

import com.zx.pojo.Type;

import java.awt.print.Pageable;
import java.util.List;


public interface TypeService {

    //增加类别
    int saveType(Type type);

    //查询类别
    Type    getType(Long id);


//      <!--查询所有分类-->
    List<Type> getAllType();


//    <!--分类页面查询-->
    List<Type>getAllTypeAndBlog();

    Type getTypeByName(String name);

//    修改type
    int updateType(Type type);

//    删除一个type
    void deleteType(Long id);

}
