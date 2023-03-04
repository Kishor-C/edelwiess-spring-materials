package com;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao1 implements UserDao {

	@Override
	public void save() {
		System.out.println("save() of UserDao1");
	}

}
