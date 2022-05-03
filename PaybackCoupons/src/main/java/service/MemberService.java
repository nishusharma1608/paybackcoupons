package service;
import java.util.*;

import data.Member;

public interface MemberService {
	List<Member> getCouponMembers(int couponId);
	List<Member> getAllMembers();
}
