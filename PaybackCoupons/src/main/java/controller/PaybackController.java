package controller;
import java.beans.JavaBean;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.Coupon;
import data.Member;
import lombok.Getter;
import lombok.Setter;
import service.CouponService;
import service.MemberService;
import util.MemberNotFoundExeption;
import util.CouponNotFoundException;;
/**
 * Controller for the application. Helps in fetching coupons and members.
 * @author nishusharma
 *
 */
@RestController
@RequestMapping("/payback")
@Setter
@Getter
@JavaBean
public class PaybackController {

	@Autowired
	CouponService couponService;
	@Autowired
	MemberService memberService;
	
	
	@GetMapping("/allCoupons")
	List<Coupon> getAllCoupons() {
		return couponService.getAllCoupons();
	}
	
	@GetMapping("/allMembers")
	List<Member> getAllMembers() {
		return memberService.getAllMembers();
	}
	
	@GetMapping("/getMemberCoupons/{memberId}") 
	ResponseEntity<List<Coupon>> getMemberCoupons(@PathVariable int memberId) {
		try {
			return new ResponseEntity<List<Coupon>>(couponService.getMemberCoupons(memberId), HttpStatus.OK);
		}
		catch(MemberNotFoundExeption memberNotFoundException ){
			return new ResponseEntity(memberNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
		}

	}
	
	@GetMapping("/getCouponMember/{couponId}")
	ResponseEntity<List<Member>> getCouponMembers(@PathVariable int couponId) {
		try {
			return new ResponseEntity<List<Member>>(memberService.getCouponMembers(couponId), HttpStatus.OK);
		}
		catch(CouponNotFoundException couponNotFoundException) {
			return new ResponseEntity(couponNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}
