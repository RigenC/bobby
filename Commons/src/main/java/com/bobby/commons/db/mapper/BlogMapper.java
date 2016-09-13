package com.bobby.commons.db.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import com.bobby.commons.service.blog.util.Blog;


public interface BlogMapper {
	@Insert("insert into blog(title,content) values(#{title},#{content})")
	public void insertBlog(Blog blog);
	@Delete("delete from blog where id=#{id}")
	public void deleteBlog(int id);
	@Update("update blog set read_number=read_number+1 where id=#{id}")
	public void addReadNumber(int id);
}
