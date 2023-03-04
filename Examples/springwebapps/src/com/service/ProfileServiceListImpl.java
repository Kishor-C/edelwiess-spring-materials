package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.beans.Profile;

@Service
public class ProfileServiceListImpl implements ProfileService {

	// a dummy database to store profile objects
	private List<Profile> profilesList = new ArrayList<Profile>();
	
	@Override
	public int store(Profile profile) {
		profilesList.add(profile);
		return profilesList.size();
	}

	@Override
	public List<Profile> getProfiles() {
		return profilesList;
	}

}
