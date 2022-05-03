package util;

import lombok.NoArgsConstructor;

/**
 * This exception is thrown when coupon doesn't exist in the database.
 * @author nishusharma
 *
 */
@NoArgsConstructor
public class CouponNotFoundException extends RuntimeException {
	  private String message;
	  public CouponNotFoundException(String message) {
	     super(message);
	     this.message = message;
	  }

}
