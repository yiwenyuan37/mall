package com.ywy.mall.pms.service.impl;

import com.ywy.common.pms.entities.Comment;
import com.ywy.mall.pms.mapper.CommentMapper;
import com.ywy.mall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author ywy
 * @since 2020-03-26
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
