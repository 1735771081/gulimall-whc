package com.wu.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wu.product.entity.ProductAttrValueEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * spu属性值
 * 
 * @author whc
 * @email 1735771081@qq.com
 * @date 2022-08-07 01:51:40
 */
@Mapper
public interface ProductAttrValueDao extends BaseMapper<ProductAttrValueEntity> {
	
}
