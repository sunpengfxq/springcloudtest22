package com.jk.Service;

import com.jk.dao.UserMapper;
import com.jk.model.User;

import com.jk.utils.EasyuiPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public List<User> queryGoodsList() {
        return userMapper.selectUser();
    }
}
