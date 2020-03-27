package com.ywy.mall.pms;

import com.ywy.mall.pms.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ywy on 2020/3/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallPmsApplicationTest {

    @Autowired
    private ProductService productService;

    @Test
    public void test(){
        System.out.println(productService.getById(1));
    }


}
