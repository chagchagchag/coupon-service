package io.chagchagchag.project.coupon.dataaccess.cache.redis.valueobject.factory;

import io.chagchagchag.project.coupon.dataaccess.cache.redis.valueobject.CouponRedisEntity;
import io.chagchagchag.project.coupon.dataaccess.mysql.entity.CouponEntity;
import org.springframework.stereotype.Component;

@Component
public class CouponRedisEntityFactory {

    public CouponRedisEntity fromCouponEntity(CouponEntity couponEntity){
        return new CouponRedisEntity(
            couponEntity.getId(),
            couponEntity.getCouponAssignType(),
            couponEntity.getTotalQuantity(), couponEntity.hasIssueQuantityAvailable(),
            couponEntity.getIssueStartDateTime(), couponEntity.getIssueEndDateTime()
        );
    }

}
