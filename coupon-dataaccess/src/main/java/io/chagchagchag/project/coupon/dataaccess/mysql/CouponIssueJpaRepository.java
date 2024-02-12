package io.chagchagchag.project.coupon.dataaccess.mysql.repository;

import io.chagchagchag.project.coupon.core.dataaccess.entity.CouponIssueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponIssueJpaRepository extends JpaRepository<CouponIssueEntity, Long> {
}