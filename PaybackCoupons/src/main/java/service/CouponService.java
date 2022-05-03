package service;
import java.util.*;

import data.Coupon;

public interface CouponService {
	List<Coupon> getMemberCoupons(int memberId);
	List<Coupon> getAllCoupons();
}
