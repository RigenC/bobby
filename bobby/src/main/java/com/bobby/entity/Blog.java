package com.bobby.entity;

import java.util.Date;

public class Blog {
	private int id;
	private String title;
	private String content;
	private Date create_time;
	private int read_number;
	public Blog(){
		this.create_time=new Date();
	}
	public Blog(String title,String content){
		this.title=title;
		this.content=content;
		this.create_time=new Date();
	}
	public Blog(int id, String title, String content, Date create_time,
			int read_number) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.create_time = create_time;
		this.read_number = read_number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getRead_number() {
		return read_number;
	}
	public void setRead_number(int read_number) {
		this.read_number = read_number;
	}
	
}
