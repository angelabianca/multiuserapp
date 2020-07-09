package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.service.memo;

import java.util.List;

import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.memo.MemoDto;

public interface MemoService {
	
	List<MemoDto> getUserMemos(Long customerId);

	MemoDto createMemo(MemoDto memoDto);

	void deleteMemo(Long id);
}