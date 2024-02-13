package io.chagchagchag.project.coupon.dataaccess.mysql.repository;

import io.chagchagchag.project.coupon.dataaccess.mysql.entity.CouponEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponJpaRepository extends JpaRepository<CouponEntity, Long> {
}
