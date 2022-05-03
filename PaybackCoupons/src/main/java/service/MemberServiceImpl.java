package service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.Member;
import repositories.MemberRepository;
import util.CouponNotFoundException;

/**
 * Service to fetch members
 * @author nishusharma
 *
 */
@Service
@Transactional
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public List<Member> getCouponMembers(int couponId) {
		List<Member> members = memberRepository.getCouponMember(couponId);
		if (members==null || members.isEmpty())
			throw new CouponNotFoundException("Coupon doesn't exist or invalid couponId");
		return members;
	}

	@Override
	public List<Member> getAllMembers() {
		return memberRepository.getAllMembers();
	}
}
