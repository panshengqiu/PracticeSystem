package cn.edu.bjut.springbootproject1.mapper;

import cn.edu.bjut.springbootproject1.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper // 程序在运行时，会自动生成该接口的代理对象交给IOC容器管理
public interface UserMapper {
    @Select("select * from user")
    public List<User> list();
}
