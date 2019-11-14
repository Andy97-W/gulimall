package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author andy
 * @email andy972019@aliyun.com
 * @date 2019-11-14 15:57:03
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
