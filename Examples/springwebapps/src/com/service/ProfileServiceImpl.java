package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.beans.Profile;
import com.dao.ProfileDao;

@Service
@Primary
public class ProfileServiceImpl implements ProfileService {
	// autowired dao layer using interface
	@Autowired
	private ProfileDao dao; // supplies ProfileDaoJdbcImpl
	
	@Override
	public int store(Profile profile) {
		// TODO Auto-generated method stub
		return dao.save(profile);
	}

	@Override
	public List<Profile> getProfiles() {
		// TODO Auto-generated method stub
		return dao.fetchProfiles();
	}

	@Override
	public Profile getProfile(int id) {
		// TODO Auto-generated method stub
		return dao.fetchProfileById(id); // returns Profile based on id
	}
	
}
