package com.bobby.service.member;


import javax.jws.*;

import com.bobby.entity.Member;
import com.bobby.service.member.imp.IMemberService;

@WebService
public class MemberService implements IMemberService{

	public Member getMemberById(int id) {
		// TODO Auto-generated method stub
		Member member=new Member(1, "Tom", "sc123456");
		return member;
	}

	public int getMemberNameById(int id) {
		// TODO Auto-generated method stub
		return id;
	}

	public boolean validateMember(Member member) {
		// TODO Auto-generated method stub
		return true;
	}
	public static void main(String[] args) {
		
	}

}
