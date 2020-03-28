package com.ywy.mall.ums.service.impl;

import cn.hutool.crypto.digest.DigestUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ywy.common.ums.entities.Admin;
import com.ywy.mall.ums.mapper.AdminMapper;
import com.ywy.mall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author ywy
 * @since 2020-03-26
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Override
    public Admin login(String username, String password) {
        password= DigestUtil.md5Hex(password);
        QueryWrapper<Admin> wrapper = new QueryWrapper<Admin>().eq("username", username)
                .eq("password", password);
        return baseMapper.selectOne(wrapper);
    }

    @Override
    public Admin getByName(String username) {
        return baseMapper.selectOne(new QueryWrapper<Admin>()
                .eq("username",username));
    }
}
