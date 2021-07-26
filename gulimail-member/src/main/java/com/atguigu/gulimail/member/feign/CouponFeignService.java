package com.atguigu.gulimail.member.feign;


import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// 告诉SpringCloud是一个远程客户端
@FeignClient("gulimail-coupon")
public interface CouponFeignService {
    // 返回会员的所有优惠劵
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
