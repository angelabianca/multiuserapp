package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.User;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.repository.memo.MemoRepository;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.repository.user.UserRepository;
/*
 * @author Angela Meixner
 * @version 1.5
 * @date 10.07.20
 */
@Component
public class ServerInitialize implements ApplicationRunner {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MemoRepository memoRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		User user1, user2, user3, user4;
		
		user1 = userRepository.createUser("user1");
		user2 = userRepository.createUser("user2");
		user3 = userRepository.createUser("user3");
		user4 = userRepository.createUser("user4");
		
		memoRepository.createMemo(user1, "note for user 1");
		memoRepository.createMemo(user1, "another note for user 1");
		memoRepository.createMemo(user2, "note for user 2");
		memoRepository.createMemo(user3, "note for user 3");
		memoRepository.createMemo(user4, "note for user 4");
	}
}