package com.wu.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wu.member.entity.UmsMemberStatisticsInfoEntity;
import com.wu.member.service.UmsMemberStatisticsInfoService;
import com.wu.common.utils.PageUtils;
import com.wu.common.utils.R;



/**
 * 会员统计信息
 *
 * @author whc
 * @email 1735771081@qq.com
 * @date 2022-08-07 21:48:20
 */
@RestController
@RequestMapping("/coupon/UmsMemberStatisticsInfo")
public class UmsMemberStatisticsInfoController {
    @Autowired
    private UmsMemberStatisticsInfoService umsMemberStatisticsInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberStatisticsInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		UmsMemberStatisticsInfoEntity umsMemberStatisticsInfo = umsMemberStatisticsInfoService.getById(id);

        return R.ok().put("umsMemberStatisticsInfo", umsMemberStatisticsInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UmsMemberStatisticsInfoEntity umsMemberStatisticsInfo){
		umsMemberStatisticsInfoService.save(umsMemberStatisticsInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UmsMemberStatisticsInfoEntity umsMemberStatisticsInfo){
		umsMemberStatisticsInfoService.updateById(umsMemberStatisticsInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		umsMemberStatisticsInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
