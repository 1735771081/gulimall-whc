package com.wu.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wu.common.utils.PageUtils;
import com.wu.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author whc
 * @email 1735771081@qq.com
 * @date 2022-08-07 01:51:40
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

