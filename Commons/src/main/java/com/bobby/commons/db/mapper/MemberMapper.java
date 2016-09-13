package com.bobby.commons.db.mapper;

import org.apache.ibatis.annotations.*;

import com.bobby.commons.service.member.util.Member;


public interface MemberMapper {
	@Insert("insert into member(username,password) values(#{username},#{password})")
	public void insertMember(Member member);
	@Select("select id,username,nickyname,password from member where username=#{username}")
	public Member selectMemeberByUserName(String username);
	@Select("select password from member where username=#{username}")
	public String getPasswordByUserName(String username);
	@Update("update member set nickyname=#{nickyname} where username=#{username}")
	public void updateNickyName(String nickyname,String username);
	@Update("update member set password=#{password} where username=#{username}")
	public void updatePassWord(String password,String username);
	@Update("update member set m_type=#{m_type} where username=#{username}")
	public void updateM_type(int m_type,String username);
	@Update("update member set m_state=#{m_state} where username=#{username}")
	public void updateM_state(int m_state,String username);
	@Select("select count(username) from member where username=#{username}")
	public int isUserName(String username);
	@Select("select count(nickyname) from member where nickyname=#{nickyname}")
	public int isNickyName(String nickyname);
}