package com.explore.space.api.controller;

import com.explore.space.infrastructure.enums.DictCodeEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String getEnum() {
         return DictCodeEnum.USER_ROLE_ADMIN.getVCategory()
         + DictCodeEnum.USER_ROLE_ADMIN.getKey()
         + DictCodeEnum.USER_ROLE_NORMAL.getValue();
    }
}
