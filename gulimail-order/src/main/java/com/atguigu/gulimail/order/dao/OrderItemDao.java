package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zzzzzzzs
 * @email 1443539042@qq.com
 * @date 2021-01-08 11:07:35
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}