package medium_clone.dao;

import java.util.ArrayList;
import java.util.List;

import medium_clone.model.Tag;

public class TagDao {
private static List<Tag> tagList = new ArrayList<Tag>();
	
	public void saveTag(Tag tag) {
		tagList.add(tag);
	}
}
