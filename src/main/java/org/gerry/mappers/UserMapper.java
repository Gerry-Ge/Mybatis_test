package org.gerry.mappers;

import java.io.Serializable;
import java.util.List;

import org.gerry.beans.UserBean;

public interface UserMapper extends Serializable {
	public void insertUser(UserBean UserBean) throws Exception;
	
	public int updateUser(UserBean UserBean,int id) throws Exception;
	
	public int deleteUser(int id) throws Exception;
	
	public UserBean selectUserById(int id) throws Exception;
	
	public List<UserBean> selectAllUser() throws Exception;

}
