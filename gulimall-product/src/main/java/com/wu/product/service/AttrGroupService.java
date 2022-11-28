package com.wu.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wu.common.utils.PageUtils;
import com.wu.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author whc
 * @email 1735771081@qq.com
 * @date 2022-08-07 01:51:40
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

