package io.chagchagchag.project.coupon.api.application.mapper;

import io.chagchagchag.project.coupon.api.application.valueobject.CouponIssueRequest;
import io.chagchagchag.project.coupon.dataaccess.cache.redis.valueobject.CouponIssueQueueDto;
import org.springframework.stereotype.Component;

@Component
public class CouponRequestMapper {
    public CouponIssueQueueDto toCouponQueueIssueDto(CouponIssueRequest request){
        return new CouponIssueQueueDto(request.userId(), request.couponId());
    }
}
