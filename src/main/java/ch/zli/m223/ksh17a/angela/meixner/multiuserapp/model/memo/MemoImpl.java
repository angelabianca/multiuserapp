package ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.memo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.User;
import ch.zli.m223.ksh17a.angela.meixner.multiuserapp.model.user.UserImpl;

@Entity(name = "Memo")
public class MemoImpl implements Memo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private UserImpl user;
	
	private String note;
	private long date;
	
	protected MemoImpl() {} // for JPA only
	
	public MemoImpl(UserImpl User, String note) {
		
		this.user = User;
		this.note = note;
		this.date = new Date().getTime();
	}
	
	@Override
	public Long getId() {
		
		return id;
	}
	
	@Override
	public User getUser() {
		
		return user;
	}
	
	@Override
	public String getNote() {
		
		return note;
	}
	
	@Override
	public long getDate() {
		
		return date;
	}
}