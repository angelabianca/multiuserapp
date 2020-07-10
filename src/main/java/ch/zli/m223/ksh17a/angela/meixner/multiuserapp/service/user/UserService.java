package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.service.user;

import java.util.List;

import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.User;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.UserDto;
/*
 * @author Angela Meixner
 * @version 1.5
 * @date 10.07.20
 */
public interface UserService {

	public List<UserDto> getAllUsers();

	public User getUserById(Long id);

	public User createUser(String name);

	public void deleteUser(Long id);
}