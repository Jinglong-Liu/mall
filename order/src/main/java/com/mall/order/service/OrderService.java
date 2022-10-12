package com.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author ljl
 * @email liujinglong0011@163.com
 * @date 2022-10-12 10:20:43
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

