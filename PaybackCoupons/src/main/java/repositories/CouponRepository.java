package repositories;

import data.Coupon;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer>{
	@Query(value="SELECT couponId, validFrom, validUntil, memberId FROM coupons " + 
			"WHERE memberId=?1 and validFrom<=current_date() and validUntil>=current_date() " + 
			"order by validUntil desc", nativeQuery = true)
	List<Coupon> getMemberCoupons(int memberId);
	
	@Query(value="SELECT couponId, validFrom, validUntil, memberId FROM coupons", nativeQuery = true)
	List<Coupon> getAllCoupons();
}