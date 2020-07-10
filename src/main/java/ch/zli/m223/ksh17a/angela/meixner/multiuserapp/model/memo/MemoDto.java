package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.memo;

import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.User;
/*
 * @author Angela Meixner
 * @version 1.5
 * @date 10.07.20
 */
public class MemoDto {
	
	public long id;
	public User user;
	public String note;
	public long date;
	
	public MemoDto() {} // for JPA only
	
	public MemoDto(Memo memo) {
		
		id = memo.getId();
		user = memo.getUser();
		note = memo.getNote();
		date = memo.getDate();
	}
}