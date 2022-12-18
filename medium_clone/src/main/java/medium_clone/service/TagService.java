package medium_clone.service;

import java.util.List;

import medium_clone.dao.TagDao;
import medium_clone.model.Tag;

public class TagService {
	private TagDao tagDao = new TagDao();
	
	public void saveTag(Tag Tag) {
		System.out.println("ben bir tagDao objesiyim:" + tagDao.toString());

		
		tagDao.saveTag(Tag);
	}


}
