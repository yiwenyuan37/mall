package com.ywy.mall.pms.service.impl;

import com.ywy.common.pms.entities.Product;
import com.ywy.mall.pms.mapper.ProductMapper;
import com.ywy.mall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author ywy
 * @since 2020-03-26
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
