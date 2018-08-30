package org.gerry.springboot.dao;

import org.gerry.beans.UserBean;
import org.springframework.stereotype.Repository;

@Repository
// extends JpaRepository<UserBean,Integer>
public interface UserDao {

	UserBean findById(int id);
}
=======
package org.gerry.springboot.dao;

import org.gerry.beans.UserBean;
import org.springframework.stereotype.Repository;

@Repository
// extends JpaRepository<UserBean,Integer>
public interface UserDao {

	UserBean findById(int id);
}
