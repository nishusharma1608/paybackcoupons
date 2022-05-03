package util;

import lombok.NoArgsConstructor;

/**
 * This exception is thrown when member doesn't exist in the database.
 * @author nishusharma
 *
 */
@NoArgsConstructor
public class MemberNotFoundExeption extends RuntimeException {
	  private String message;
	  public MemberNotFoundExeption(String message) {
	     super(message);
	     this.message = message;
	  }

}
