package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.service.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.User;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.UserDto;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.repository.user.UserRepository;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.service.exceptions.UserAlreadyExistsException;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.service.exceptions.InvalidParamException;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository UserRepository;
	
	@Override
	public List<UserDto> getAllUsers() {
		
		List<User> oldList;
		List<UserDto> newList;
		
		oldList = UserRepository.findAllUsers();
		
		newList = new ArrayList<>();
		
		for (User user : oldList) {
			newList.add(new UserDto(user));
		}
		
		return newList;
	}

	@Override
	public User getUserById(Long id) {
		
		if (id == null) {
			// TODO error handling
		}
		
		return UserRepository.findById(id).orElseThrow(RuntimeException::new); // throw better exception
	}

	@Override
	public User createUser(String name) {
		
		// Check input
		
		if (name == null) {
			throw new InvalidParamException(
				String.format("Name: %s", name)
			);
		}
		
		// Check logic: User may already exist
		
		User existingUser;
		
		existingUser = UserRepository.findUserByName(name);
		
		if (existingUser != null) {
			throw new UserAlreadyExistsException(
				String.format("Name: %s", name)
			);
		}
		
		return UserRepository.createUser(name);
	}

	@Override
	public void deleteUser(Long id) {
		
		UserRepository.deleteById(id);
	}
}