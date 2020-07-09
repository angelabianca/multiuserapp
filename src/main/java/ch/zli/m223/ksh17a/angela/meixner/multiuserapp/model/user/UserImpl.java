package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.memo.MemoImpl;

@Entity(name = "User")
public class UserImpl implements User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@OneToMany(
		mappedBy = "user",
		cascade = CascadeType.REMOVE,
		fetch = FetchType.EAGER
	)
	private List<MemoImpl> memos;
	
	// for JPA only
	
	public UserImpl() {
		
		memos = new ArrayList<>();
	}
	
	public UserImpl(String name) {
		
		this();
		
		this.name = name;
	}
	
	public UserImpl(User user) {
		
		this();
		
		id = user.getId();
		
		name = user.getName();
	}

	@Override
	public Long getId() {
		
		return id;
	}

	@Override
	public String getName() {
		
		return name;
	}
}