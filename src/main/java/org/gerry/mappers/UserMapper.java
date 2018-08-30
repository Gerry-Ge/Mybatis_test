package org.gerry.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.gerry.beans.UserBean;
import org.gerry.mybatisPagePlugin.Page;

public interface UserMapper extends Serializable {
	// java.lang.Integer
	// org.apache.ibatis.type.JdbcType.
	// org.apache.ibatis.type.JdbcType.
	// @Insert(" insert into userdb (username,password,account) values (#{username},#{password},#{account})")
	public void insertUser(UserBean UserBean) throws Exception;

	// @Update("update userdb  set username=#{username},password=#{password},account=#{account} where id=#{id}")
	public int updateUser(UserBean UserBean, int ID) throws Exception;

	// @Delete("delete from userdb where id=#{id}")
	public int deleteUser(int id) throws Exception;

//	 @Select("select * from userdb where id=#{id}")
	public UserBean selectUserById(int id) throws Exception;

	// @Select("select * from userdb ")
	public List<UserBean> selectAllUser() throws Exception;

	// @Delete("delete from userdb")
	public void deleteAll() throws Exception;

	public UserBean selectUserPost(int id) throws Exception;

	public UserBean selectUserTeacher(int id) throws Exception;

	public UserBean selectUserPostTeacher(int id) throws Exception;

	public List<UserBean> getUserListPage(@Param("page") Page page) throws Exception;

}
=======
package org.gerry.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.gerry.beans.UserBean;
import org.gerry.mybatisPagePlugin.Page;

public interface UserMapper extends Serializable {
	// java.lang.Integer
	// org.apache.ibatis.type.JdbcType.
	// org.apache.ibatis.type.JdbcType.
	// @Insert(" insert into userdb (username,password,account) values (#{username},#{password},#{account})")
	public void insertUser(UserBean UserBean) throws Exception;

	// @Update("update userdb  set username=#{username},password=#{password},account=#{account} where id=#{id}")
	public int updateUser(UserBean UserBean, int ID) throws Exception;

	// @Delete("delete from userdb where id=#{id}")
	public int deleteUser(int id) throws Exception;

//	 @Select("select * from userdb where id=#{id}")
	public UserBean selectUserById(int id) throws Exception;

	// @Select("select * from userdb ")
	public List<UserBean> selectAllUser() throws Exception;

	// @Delete("delete from userdb")
	public void deleteAll() throws Exception;

	public UserBean selectUserPost(int id) throws Exception;

	public UserBean selectUserTeacher(int id) throws Exception;

	public UserBean selectUserPostTeacher(int id) throws Exception;

	public List<UserBean> getUserListPage(@Param("page") Page page) throws Exception;

}
