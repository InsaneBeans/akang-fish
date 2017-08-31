package com.fisher.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fisher.domain.User;

@Mapper
public interface UserMapper {
    
    User getUser(@Param("name") String name);
    
    String getUserMark(@Param("name") String name);
    
    List<User> getAllUsers();
    
    void updateUserMark(@Param("name")String name, @Param("mark") String mark);
    
    List<User> searchUsers(@Param("keyword") String key);

}
