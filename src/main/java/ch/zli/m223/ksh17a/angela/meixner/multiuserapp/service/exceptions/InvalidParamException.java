package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.service.exceptions;

@SuppressWarnings("serial")
public class InvalidParamException extends RuntimeException {
	
	public InvalidParamException(String message) {
		
		super(message);
	}
}