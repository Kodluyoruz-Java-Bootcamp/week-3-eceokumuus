package medium_clone.model;

import java.time.LocalDateTime;

public class Blog {
	private String title;
	private String content;
	private LocalDateTime createDate;
	private Boolean isPublished;
	private Tag tag;
	private User user;
	
	public Blog(String title, String content, User user) {
		this.title= title;
		this.content = content;
		this.createDate = LocalDateTime.now();
		this.isPublished = false;
		this.user = user;
		
	} 
	
	public User getUser() {
		return user;
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

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public Boolean getIsPublished() {
		return isPublished;
	}

	
	public void publish() {
		this.isPublished = true;
	}

}
