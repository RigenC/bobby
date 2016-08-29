package com.bobby.db.imp;

import org.apache.ibatis.annotations.*;

import com.bobby.entity.Member;

public interface MemberMapper {
	@Insert("insert into member(username,password) values(#{username},#{password})")
	public void insertMember(Member member);
	@Select("select id,username,password from member where id=#{id}")
	public Member selectMemeberById(int id);
}