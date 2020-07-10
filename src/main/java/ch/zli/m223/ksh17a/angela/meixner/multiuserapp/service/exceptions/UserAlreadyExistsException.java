package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.service.exceptions;
/*
 * @author Angela Meixner
 * @version 1.5
 * @date 10.07.20
 */
@SuppressWarnings("serial")
public class UserAlreadyExistsException extends RuntimeException {
	
	public UserAlreadyExistsException(String message) {
		
		super(message);
	}
}