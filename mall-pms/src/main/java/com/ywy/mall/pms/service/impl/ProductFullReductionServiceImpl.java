package com.ywy.mall.pms.service.impl;

import com.ywy.common.pms.entities.ProductFullReduction;
import com.ywy.mall.pms.mapper.ProductFullReductionMapper;
import com.ywy.mall.pms.service.ProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author ywy
 * @since 2020-03-26
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}
