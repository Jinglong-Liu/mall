package com.mall.coupon.dao;

import com.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ljl
 * @email liujinglong0011@163.com
 * @date 2022-10-12 09:50:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
