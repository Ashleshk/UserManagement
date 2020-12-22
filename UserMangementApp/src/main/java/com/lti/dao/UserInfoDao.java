package com.lti.dao;

import java.util.Set;

import com.lti.model.UserInfo;

public interface UserInfoDao {
    public int registerUser(UserInfo userInfo);
    
    public boolean loginUser(String userName,String userPassword);
    
    public int updateUser(UserInfo userInfo);
    
    public int deleteUser(int userId);
    
    public UserInfo findUserById(int userId);
    
    public Set<UserInfo> viewAllUsers();
}
