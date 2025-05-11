package com.manzi.customer.config;

import com.manzi.customer.dto.UserDto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("manzi-user-service")
public interface UserFeign {

    @RequestMapping(value = "/user/")
    UserDto[] getUsers();
}
