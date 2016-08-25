package com.bobby.service.member.imp;

import javax.jws.WebParam;
import javax.jws.WebService;
import com.bobby.entity.Member;

@WebService
public interface IMemberService {
	public Member getMemberById(@WebParam(name="id")int id);
	public int getMemberNameById(@WebParam(name="id")int id);
	public boolean validateMember(Member member);
}
