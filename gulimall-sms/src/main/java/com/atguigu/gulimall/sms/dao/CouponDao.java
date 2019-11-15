package com.atguigu.gulimall.sms.dao;

import com.atguigu.gulimall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author andy
 * @email andy972019@aliyun.com
 * @date 2019-11-14 16:18:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
