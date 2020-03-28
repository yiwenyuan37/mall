package com.ywy.mall.ums.service.impl;

import com.ywy.common.ums.entities.AdminPermissionRelation;
import com.ywy.mall.ums.mapper.AdminPermissionRelationMapper;
import com.ywy.mall.ums.service.AdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author ywy
 * @since 2020-03-26
 */
@Service
public class AdminPermissionRelationServiceImpl extends ServiceImpl<AdminPermissionRelationMapper, AdminPermissionRelation> implements AdminPermissionRelationService {

}
