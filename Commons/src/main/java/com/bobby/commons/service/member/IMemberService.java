package com.bobby.commons.service.member;

import javax.jws.WebParam;

import com.bobby.commons.service.member.util.Member;



public interface IMemberService {
	public Member getMemberByUserName(String username);
	public boolean validateMember(Member member);
	public boolean insertMember(Member member);
	public boolean updateType(String username,int type);
	public boolean updateState(String username,int state);
	public boolean updateNickyName(String username,String nickyname);
	public boolean isUserName(String username);
	public boolean isNickyName(String nickyname);
}

