package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.repository.user;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.User;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.UserImpl;
/*
 * @author Angela Meixner
 * @version 1.5
 * @date 10.07.20
 */
public interface UserRepository extends JpaRepository<UserImpl, Long> {

	public default List<User> findAllUsers() {
		
		return new ArrayList<User>(findAll());
	}
	
	public User findUserByName(String name);
	
	public default  User createUser(String name) {
		
		return save(new UserImpl(name));
	}

}