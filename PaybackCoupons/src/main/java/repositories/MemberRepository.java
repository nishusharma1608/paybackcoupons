package repositories;

import data.Member;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{
	@Query(value="SELECT memberId, name, address FROM members", nativeQuery = true)
	List<Member> getAllMembers();
	
	@Query(value="SELECT m.memberId as memberId, name, address FROM members m inner join coupons c on m.memberId=c.memberId WHERE couponId=?1", nativeQuery = true)
	List<Member> getCouponMember(int couponId);
}