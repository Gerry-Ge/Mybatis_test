package org.gerry.springboot.dao;

import org.gerry.beans.UserBean;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserBean,Integer> {

	UserBean findById(int id);
}
