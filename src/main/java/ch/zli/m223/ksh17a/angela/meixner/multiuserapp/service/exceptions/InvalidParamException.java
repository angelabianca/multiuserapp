package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.service.exceptions;
/*
 * @author Angela Meixner
 * @version 1.5
 * @date 10.07.20
 */
@SuppressWarnings("serial")
public class InvalidParamException extends RuntimeException {
	
	public InvalidParamException(String message) {
		
		super(message);
	}
}