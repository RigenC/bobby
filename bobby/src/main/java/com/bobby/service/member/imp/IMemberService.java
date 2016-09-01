package com.bobby.service.member.imp;

import javax.jws.WebParam;
import javax.jws.WebService;
import com.bobby.entity.Member;

@WebService
public interface IMemberService {
	public Member getMemberByUserName(@WebParam(name="username")String username);
	public boolean validateMember(Member member);
	public boolean insertMember(Member member);
	public boolean updateType(String username,int type);
	public boolean updateState(String username,int state);
	public boolean updateNickyName(String username,String nickyname);
	public boolean isUserName(String username);
	public boolean isNickyName(String nickyname);
}
