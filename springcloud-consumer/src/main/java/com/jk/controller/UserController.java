package com.jk.controller;

import com.jk.Service.UserService;
import com.jk.model.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping("goods")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping("queryGoodsList")
    public List<User> queryGoodsList(){

        System.out.println(111);
        System.out.println(222);
          System.out.println(444);
        return userService.queryGoodsList();
    }
}
