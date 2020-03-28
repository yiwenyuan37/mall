package com.ywy.mall.ums.service;

import com.ywy.common.ums.entities.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author ywy
 * @since 2020-03-26
 */
public interface AdminService extends IService<Admin> {

    Admin login(String username, String password);

    Admin getByName(String username);
}
