package com.mall.product;

import com.mall.product.entity.BrandEntity;
import com.mall.product.service.BrandService;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.annotation.Resources;

@SpringBootTest
class ProductApplicationTests {

    @Resource
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brand = new BrandEntity();
        brand.setDescript("描述");
        brand.setName("品牌名");
        brandService.save(brand);
        System.out.println("保存成功...");
    }

}
