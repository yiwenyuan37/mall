package com.ywy.mall.ums.service.impl;

import com.ywy.common.ums.entities.Member;
import com.ywy.mall.ums.mapper.MemberMapper;
import com.ywy.mall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author ywy
 * @since 2020-03-26
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
