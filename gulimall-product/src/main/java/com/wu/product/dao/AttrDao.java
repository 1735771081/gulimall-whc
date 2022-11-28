package com.wu.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wu.product.entity.AttrEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author whc
 * @email 1735771081@qq.com
 * @date 2022-08-07 01:51:40
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
