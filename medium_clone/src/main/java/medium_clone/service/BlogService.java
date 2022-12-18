package medium_clone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import medium_clone.dao.BlogDao;

import medium_clone.model.Blog;

public class BlogService {
	private BlogDao blogDao = new BlogDao();
	
	public void createBlog(Blog blog) {	
				
		blogDao.saveBlog(blog);
		System.out.println("createBlog :: " + blog.getTitle());
	}
	
	public List<Blog> getAll(){
		return blogDao.findAll();
	}
	
	public void printAll(List<Blog> blogList) {
		blogList.forEach(blog -> System.out.println(blog));
	}


}
