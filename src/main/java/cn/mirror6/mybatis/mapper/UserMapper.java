package cn.mirror6.mybatis.mapper;

import cn.mirror6.mybatis.entity.User;

import java.util.List;

/**
 * @Description:
 * @Author: mirror6
 * @Date: 2020/9/17 14:57
 */
public interface UserMapper {

    /**
     * 列表
     *
     * @return list
     */
    List<User> getUserList();
}
