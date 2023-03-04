package com;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class UserDao2 implements UserDao {

	@Override
	public void save() {
		System.out.println("save() of UserDao2");
	}

}