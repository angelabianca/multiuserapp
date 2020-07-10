package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.service.memo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.memo.Memo;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.memo.MemoDto;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.repository.memo.MemoRepository;
/*
 * @author Angela Meixner
 * @version 1.5
 * @date 10.07.20
 */
@Service
public class MemoServiceImpl implements MemoService {
	
	@Autowired
	MemoRepository memoRepository;
	
	@Override
	public List<MemoDto> getUserMemos(Long UserId) {
		
		List<Memo> oldList;
		List<MemoDto> newList;
		
		oldList = memoRepository.findMemoByUserId(UserId);
		
		newList = new ArrayList<>();
		
		for (Memo user : oldList) {
			newList.add(new MemoDto(user));
		}
		
		return newList;
	}

	@Override
	public MemoDto createMemo(MemoDto memoDto) {
		
		return new MemoDto(memoRepository.createMemo(memoDto.user, memoDto.note));
	}

	@Override
	public void deleteMemo(Long id) {
		
		memoRepository.deleteById(id);
	}
}