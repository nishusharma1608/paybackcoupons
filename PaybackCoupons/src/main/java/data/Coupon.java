package data;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Coupon class stores coupons data like couponId, valid dates, associated memberId, etc. 
 * @author nishusharma
 *
 */

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "coupons")
@NoArgsConstructor
public class Coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "couponId")
	private int couponId;
    
    @JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "validFrom")
    private Date validFrom;
    
    @JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "validUntil")
    private Date validUntil;
    
	@Column(name = "memberId")
	private int memberId;
	
	@Autowired
	public Coupon(int couponId, Date validFrom, Date validUntil, int memberId) {
		this.couponId = couponId;
		this.validFrom = validFrom;
		this.validUntil = validUntil;
		this.memberId = memberId;
	}

}
