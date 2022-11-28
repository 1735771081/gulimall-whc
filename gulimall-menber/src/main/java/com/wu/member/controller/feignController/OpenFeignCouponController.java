package com.wu.member.controller.feignController;

import com.wu.common.utils.R;
import com.wu.member.entity.UmsMemberEntity;
import com.wu.member.service.couponfeignservice.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OpenFeignCouponController {

    @Autowired
    private CouponFeignService feignService;

    @RequestMapping("/openfeign/coupon/list")
    public R list(@RequestParam Map<String, Object> params){
        return feignService.list(params);
    }

    @GetMapping("/openfeign/coupons/list")
    public R coupons(){
        R coupons = feignService.memberCoupons();
        UmsMemberEntity umsMemberEntity = new UmsMemberEntity();
        umsMemberEntity.setUsername("张三");

        return R.ok().put("member",umsMemberEntity).put("coupons",coupons.get("coupons"));
    }
}
