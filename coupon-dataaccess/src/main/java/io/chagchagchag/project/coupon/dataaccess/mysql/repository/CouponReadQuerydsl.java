package io.chagchagchag.project.coupon.dataaccess.mysql.repository;


import com.querydsl.jpa.JPQLQueryFactory;
import io.chagchagchag.project.coupon.dataaccess.mysql.entity.CouponEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static io.chagchagchag.project.coupon.dataaccess.mysql.entity.QCouponEntity.couponEntity;

@RequiredArgsConstructor
@Repository
public class CouponReadQuerydsl {

    private final JPQLQueryFactory queryFactory;

    public CouponEntity findCouponById(Long couponId){
        return queryFactory
                .selectFrom(couponEntity)
                .where(couponEntity.id.eq(couponId))
                .fetchOne();
    }
}
