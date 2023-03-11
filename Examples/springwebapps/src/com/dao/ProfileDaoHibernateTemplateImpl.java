package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.beans.Profile;

@Repository
public class ProfileDaoHibernateTemplateImpl implements ProfileDao {
	
	@Autowired
	private HibernateTemplate template;

	@Override
	public int save(Profile profile) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Profile> fetchProfiles() {
		// JPQL : It is a query written on entity class so that ORM generates sql query 
		// select p from Profile p;
		List<Profile> list = template.loadAll(Profile.class);
		return list;
	}

	@Override
	public Profile fetchProfileById(int id) {
		Profile profile = template.get(Profile.class, id); 
		return profile;
	}

}
