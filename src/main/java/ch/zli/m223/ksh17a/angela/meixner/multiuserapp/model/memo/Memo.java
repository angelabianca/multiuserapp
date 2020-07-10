package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.memo;

import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.User;
/*
 * @author Angela Meixner
 * @version 1.5
 * @date 10.07.20
 */
public interface Memo {
	
	Long getId();
	
	User getUser();
	
	String getNote();
	
	long getDate();
}