package org.gerry.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gerry.beans.UserBean;

public interface UserMapper extends Serializable {
	@Insert(" insert into userdb (username,password,account) values (#{username},#{password},#{account})")
	public void insertUser(UserBean UserBean) throws Exception;
	
	@Update("update userdb  set username=#{username},password=#{password},account=#{account} where id=#{id}")
	public int updateUser(UserBean UserBean,int ID) throws Exception;
	
	@Delete("delete from userdb where id=#{id}")
	public int deleteUser( int id) throws Exception;
	
	@Select("select * from userdb where id=#{id}")
	public UserBean selectUserById(int id) throws Exception;
	
	@Select("select * from userdb ")
	public List<UserBean> selectAllUser() throws Exception;
	
	@Delete("delete from userdb")
	public void deleteAll() throws Exception;

}
