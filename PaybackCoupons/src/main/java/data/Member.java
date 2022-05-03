package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Member class stores member data like memberId, name, address, etc. 
 * @author nishusharma
 *
 */

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "members")
@NoArgsConstructor
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "memberId")
	private int memberId;
    
	@Column(name = "name")
    private String name;
    
	@Column(name = "address")
	private String address;
	
	public Member(int memberId, String name, String address) {
		this.memberId = memberId;
		this.name = name;
		this.address = address;
	}
}
