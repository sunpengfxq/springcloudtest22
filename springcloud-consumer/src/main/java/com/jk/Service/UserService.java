package com.jk.Service;

import com.jk.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "service-hi")
public interface UserService {



    @GetMapping("queryGoodsList")
    List<User> queryGoodsList();
}
