package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.repository.memo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.memo.Memo;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.memo.MemoImpl;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.User;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.UserImpl;
/*
 * @author Angela Meixner
 * @version 1.5
 * @date 10.07.20
 */
public interface MemoRepository extends JpaRepository<MemoImpl, Long> {
	
	List<Memo> findMemoByUserId(Long UserId);
	
	public default Memo createMemo(User user, String note) {
		
		return save(new MemoImpl(new UserImpl(user), note));
	}
}