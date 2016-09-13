package com.bobby.commons.service.member.util;

public class Member {
	private int id;
	private String username;
	private String nickyname;
	private String password;
	private int m_type;
	private int m_state;
	public Member(){
		
	}
	public Member(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Member(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Member(String username, String password,String nickyname,int m_type,int m_state) {
		super();
		this.username = username;
		this.password = password;
		this.nickyname=nickyname;
		this.m_type=m_type;
		this.m_state=m_state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickyname() {
		return nickyname;
	}
	public void setNickyname(String nickyname) {
		this.nickyname = nickyname;
	}
	public int getM_type() {
		return m_type;
	}
	public void setM_type(int m_type) {
		this.m_type = m_type;
	}
	public int getM_state() {
		return m_state;
	}
	public void setM_state(int m_state) {
		this.m_state = m_state;
	}
	
}
