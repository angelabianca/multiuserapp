package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user;
/*
 * @author Angela Meixner
 * @version 1.5
 * @date 10.07.20
 */
public class UserDto {
	
	public long id;
	public String name;
	
	public UserDto() {} // for JPA only
	
	public UserDto(User user) {
		
		id = user.getId();
		name = user.getName();
	}
}