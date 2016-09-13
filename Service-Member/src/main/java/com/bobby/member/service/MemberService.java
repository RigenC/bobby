package com.bobby.member.service;

import javax.annotation.Resource;
import javax.jws.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bobby.commons.db.mapper.MemberMapper;
import com.bobby.commons.service.member.IMemberService;
import com.bobby.commons.service.member.util.Member;


@WebService
public class MemberService implements IMemberService{
	@Resource MemberMapper memberDB;
	private  Logger logger = LoggerFactory.getLogger(MemberService.class); 
	
	public Member getMemberByUserName(String username) {
		Member member=memberDB.selectMemeberByUserName(username);
		return member;
	}

	public boolean validateMember(Member member) {
		String password=memberDB.getPasswordByUserName(member.getUsername());
		if(password.equals(member.getPassword()))
			return true;
		else return false;
	}

	public boolean insertMember(Member member) {
		try{
			memberDB.insertMember(member);
			return true;
		}catch(Exception e){
			logger.error(e.getMessage());
			return false;
		}
	}

	public boolean updateType(String username, int type) {
		try{
			memberDB.updateM_type(type, username);
			return true;
		}catch(Exception e){
			logger.error(e.getMessage());
			return false;
		}
	}

	public boolean updateState(String username, int state) {
		try{
			memberDB.updateM_state(state, username);
			return true;
		}catch(Exception e){
			logger.error(e.getMessage());
			return false;
		}
	}

	public boolean updateNickyName(String username, String nickyname) {
		try{
			memberDB.updateNickyName(nickyname, username);
			return true;
		}catch(Exception e){
			logger.error(e.getMessage());
			return false;
		}
	}

	public boolean isUserName(String username) {
		try{
			int result=memberDB.isUserName(username);
			if(result==0)
				return true;
			else return false;
		}catch(Exception e){
			logger.error(e.getMessage());
			return false;
		}
	}

	public boolean isNickyName(String nickyname) {
		try{
			int result=memberDB.isNickyName(nickyname);
			if(result==0)
				return true;
			else return false;
		}catch(Exception e){
			logger.error(e.getMessage());
			return false;
		}
	}

}
