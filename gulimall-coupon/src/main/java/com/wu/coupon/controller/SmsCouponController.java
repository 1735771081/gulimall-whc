package com.wu.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.wu.coupon.entity.SmsCouponEntity;
import com.wu.coupon.service.SmsCouponService;
import com.wu.common.utils.PageUtils;
import com.wu.common.utils.R;



/**
 * 优惠券信息
 *
 * @author whc
 * @email 1735771081@qq.com
 * @date 2022-08-07 21:22:06
 */
@RefreshScope
@RestController
@RequestMapping("/coupon/SmsCoupon")
public class SmsCouponController {
    @Autowired
    private SmsCouponService smsCouponService;
    @Value("${coupon.age}")
    private Integer age;

    @Value("${coupon.name}")
    public String username;

//    @Value("${config.info}")
//    private String CONFIG_INFO;

//    @GetMapping("/config/info")
//    public String getConfigInfo(){
//        return CONFIG_INFO;
//    }


    @RequestMapping("/test")
    public R test(){
        return R.ok().put("port",age).put("username",username);
    }

    @RequestMapping("/coupons/list")
    public R memberCoupons(){
        SmsCouponEntity smsCouponEntity = new SmsCouponEntity();
        smsCouponEntity.setCouponName("满100减10");
        return R.ok().put("coupons", Arrays.asList(smsCouponEntity));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsCouponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsCouponEntity smsCoupon = smsCouponService.getById(id);

        return R.ok().put("smsCoupon", smsCoupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsCouponEntity smsCoupon){
		smsCouponService.save(smsCoupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsCouponEntity smsCoupon){
		smsCouponService.updateById(smsCoupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsCouponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
