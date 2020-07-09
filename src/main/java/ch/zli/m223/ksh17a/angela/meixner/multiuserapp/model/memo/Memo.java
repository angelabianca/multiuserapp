package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.memo;

import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.User;

public interface Memo {
	
	Long getId();
	
	User getUser();
	
	String getNote();
	
	long getDate();
}