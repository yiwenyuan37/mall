package com.ywy.mall.ums.controller;


import com.ywy.common.ums.entities.Admin;
import com.ywy.mall.ums.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author ywy
 * @since 2020-03-26
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    private AdminService adminService;

    @Autowired
    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping(value = "/login")
    Admin login(@RequestParam("username") String username,
                @RequestParam("password") String password){
        return adminService.login(username,password);
    }

    @PostMapping(value = "/info")
    Admin getOne(@RequestParam("username") String username){
        return adminService.getByName(username);
    }

}

