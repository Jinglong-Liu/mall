package com.mall.product.dao;

import com.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ljl
 * @email liujinglong0011@163.com
 * @date 2022-10-12 08:19:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
