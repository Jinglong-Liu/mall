package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author ljl
 * @email liujinglong0011@163.com
 * @date 2022-10-12 08:19:51
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

