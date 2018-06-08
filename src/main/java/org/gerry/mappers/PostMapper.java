package org.gerry.mappers;

import org.apache.ibatis.annotations.Insert;
import org.gerry.beans.PostBean;

public interface PostMapper {
//	@Insert("insert into post (userid,title,content,created) values(#{userid},#{title},#{content},#{created})")
	public void insertPost(PostBean postBean) throws Exception;
	
	public PostBean selectPostByUserId(int userid) throws Exception;
}
