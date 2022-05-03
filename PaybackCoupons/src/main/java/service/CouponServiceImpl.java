package service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.Coupon;
import repositories.CouponRepository;
import util.MemberNotFoundExeption;

/**
 * Service to fetch coupons
 * @author nishusharma
 *
 */
@Service
@Transactional
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponRepository couponRepository;
	
	@Override
	public List<Coupon> getMemberCoupons(int memberId) {
		List<Coupon> coupons = couponRepository.getMemberCoupons(memberId);
		if (coupons==null || coupons.isEmpty())
			throw new MemberNotFoundExeption("Member doesn't exist or invalid memberId");
		return coupons;
	}

	@Override
	public List<Coupon> getAllCoupons() {
		return couponRepository.getAllCoupons();
	}
}
