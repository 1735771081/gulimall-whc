package com.wu.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wu.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author whc
 * @email 1735771081@qq.com
 * @date 2022-08-07 01:51:40
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
