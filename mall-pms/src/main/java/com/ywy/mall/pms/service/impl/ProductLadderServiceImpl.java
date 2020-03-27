package com.ywy.mall.pms.service.impl;

import com.ywy.common.pms.entities.ProductLadder;
import com.ywy.mall.pms.mapper.ProductLadderMapper;
import com.ywy.mall.pms.service.ProductLadderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author ywy
 * @since 2020-03-26
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadder> implements ProductLadderService {

}
