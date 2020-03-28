package com.ywy.mall.admin.ums.service;

import com.ywy.common.ums.entities.Admin;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 易文渊
 * @date 2020/03/27
 **/
@FeignClient("mall-ums-service")
public interface AdminService {

    @PostMapping(value = "/admin/login")
    Admin login(@RequestParam("username") String username,
                @RequestParam("password") String password);

    @PostMapping(value = "/admin/info")
    Admin getOne(@RequestParam("username") String username);
}
