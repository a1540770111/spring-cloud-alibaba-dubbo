package com.funtl.alibaba.dubbo.provider.service;

import com.funtl.alibaba.dubbo.provider.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("provider")
public interface FooService {
    @GetMapping("/foo")
    String foo();

    @PostMapping("/login")
    UserDTO login(UserDTO userDTO);
}
