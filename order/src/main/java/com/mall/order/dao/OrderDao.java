package com.mall.order.dao;

import com.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ljl
 * @email liujinglong0011@163.com
 * @date 2022-10-12 10:20:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
