package com.wu.member.service.couponfeignservice;

import com.wu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "cloud-gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/SmsCoupon/list")
    public R list(@RequestParam Map<String, Object> params);

    @RequestMapping("/coupon/SmsCoupon/coupons/list")
    public R memberCoupons();

}
