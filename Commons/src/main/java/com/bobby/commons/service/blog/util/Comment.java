package com.bobby.commons.service.blog.util;

import java.util.Date;

public class Comment {
	private int id;
	private int blog_id;
	private int member_id;
	private Date create_time;
	private int comment_id=0;
	public Comment(int blog_id, int member_id) {
		super();
		this.blog_id = blog_id;
		this.member_id = member_id;
		this.create_time=new Date();
	}
	public Comment(int blog_id, int member_id, int comment_id) {
		super();
		this.blog_id = blog_id;
		this.member_id = member_id;
		this.comment_id = comment_id;
		this.create_time=new Date();
	}
	public Comment(int id, int blog_id, int member_id, Date create_time,
			int comment_id) {
		super();
		this.id = id;
		this.blog_id = blog_id;
		this.member_id = member_id;
		this.create_time = create_time;
		this.comment_id = comment_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
}
