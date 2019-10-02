package com.example.model.dao;
import com.example.model.bean.UserBean;
public class UserDAO {
	public boolean InsertUser(UserBean user) {
		return false;
	}
	public boolean UpdateUser(UserBean user) {
		return false;
	}
	public boolean DeleteUser(UserBean user) {
		return false;
	}
	public boolean CheckUser(UserBean user) {
		if("admin".equals(user.getUsername()) && "123".equals(user.getPassword())) {
			return true;
		}
		return false;
	}

}
