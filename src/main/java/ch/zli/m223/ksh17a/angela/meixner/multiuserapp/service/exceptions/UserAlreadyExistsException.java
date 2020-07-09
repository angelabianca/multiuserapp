package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.service.exceptions;

@SuppressWarnings("serial")
public class UserAlreadyExistsException extends RuntimeException {
	
	public UserAlreadyExistsException(String message) {
		
		super(message);
	}
}