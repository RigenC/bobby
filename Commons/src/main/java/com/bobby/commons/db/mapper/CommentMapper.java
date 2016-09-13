package com.bobby.commons.db.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bobby.commons.service.blog.util.Comment;


public interface CommentMapper {
	@Insert("insert into comment(blog_id,member_id,comment_id) values(#{blog_id},#{member_id},#{comment_id})")
	public void insertComment(Comment comment);
	@Delete("delete from comment where blog_id=#{blog_id} and member_id=#{member_id} and comment_id=#{comment_id} and create_time=#{create_time}")
	public void deleteComment(Comment comment);
	@Select("select id,blog_id,member_id,create_time,comment_id from comment where blog_id=#{blog_id}")
	public Comment getCommentByBlogId(int blog_id);
	@Select("select id,blog_id,member_id,create_time,comment_id from comment where member_id=#{member_id}")
	public Comment getCommentByMemberId(int member_id);
}
