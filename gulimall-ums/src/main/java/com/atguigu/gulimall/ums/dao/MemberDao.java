package com.atguigu.gulimall.ums.dao;

import com.atguigu.gulimall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author andy
 * @email andy972019@aliyun.com
 * @date 2019-11-14 16:26:05
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
