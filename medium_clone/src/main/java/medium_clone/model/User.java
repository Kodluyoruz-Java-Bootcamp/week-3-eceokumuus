package medium_clone.model;


import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String mail;
	private String password;
	private List<Blog> blogList;	
	private List<Tag>  favoriteTagList;
	private List<User> favoriteUserList;
	
	//contructor oluşturduk
	public User(String name, String mail, String password ) {
		this.name = name;
		this.mail = mail;
		this.password = password;
		
		this.blogList = new ArrayList<Blog>(); //kullanıma hazır boş bir bloglist oluşturduk
		this.favoriteTagList = new ArrayList<Tag>();
		this.favoriteUserList = new ArrayList<User>();
		
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}



	public List<Blog> getBlogList() {
		return blogList;  //kişilerin bloglarını listeleme
	}




	public List<Tag> getFavoriteTagList() {
		return favoriteTagList;
	}



	public List<User> getFavoriteUserList() {
		return favoriteUserList;
	}



	public void followUser(User user) {
		this.favoriteUserList.add(user);
	}
	
	public void followTag(Tag tag) {
		this.favoriteTagList.add(tag);
	}
	
	public void blogCreate(Blog blog) {
		this.blogList.add(blog);
	}
	
	public void blogRemove(Blog blog) {
		this.blogList.remove(blog);
	}
	
	public void blogPublish(Blog blog) {
		blog.publish();
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", mail=" + mail + ", password=" + password + " ]";
	}
	


}

