package com.service;

import java.util.List;

import com.beans.Profile;

public interface ProfileService {
	public int store(Profile profile);
	public List<Profile> getProfiles();
	// java 8 default methods in interface
	default Profile getProfile(int id) {
		return null;
	}
}
