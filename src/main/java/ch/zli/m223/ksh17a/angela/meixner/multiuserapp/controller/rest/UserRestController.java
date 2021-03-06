package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.controller.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.memo.MemoDto;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.UserDto;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.service.memo.MemoService;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.service.user.UserService;
/*
 * @author Angela Meixner
 * @version 1.5
 * @date 10.07.20
 */
@RestController
public class UserRestController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	MemoService memoService;
	
	@GetMapping("/rest/users")
	List<UserDto> getUserList() {
		
		return userService.getAllUsers();
	}
	
	@GetMapping("/rest/users/{id}")
	UserDto getUser(@PathVariable("id") Long id) {
		
		return new UserDto(userService.getUserById(id));
	}
	
	@PostMapping("/rest/users")
	UserDto createUser(@RequestBody UserDto userDto) {
		
		return new UserDto(userService.createUser(userDto.name));
	}
	
	@DeleteMapping("/rest/users/{id}")
	void deleteUser(@PathVariable("id") Long id) {
		
		userService.deleteUser(id);
	}
	
	@GetMapping("/rest/users/{id}/memos")
	List<MemoDto> getMemos(@PathVariable("id") Long userId) {
		
		return memoService.getUserMemos(userId);
	}
	
	@PostMapping("/rest/users/{id}/memos")
	MemoDto createMemo(@RequestBody MemoDto memoDto) {
		
		return memoService.createMemo(memoDto);
	}
}