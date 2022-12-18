package medium_clone.dao;

import java.util.ArrayList;
import java.util.List;

import medium_clone.model.Blog;


public class BlogDao {
	private static List<Blog> blogList = new ArrayList<Blog>();
	
	public void saveBlog(Blog blog) {
		blogList.add(blog);
	}
	
	public List<Blog> findAll(){
		return blogList;
	}

}
