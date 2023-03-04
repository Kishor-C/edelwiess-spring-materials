package com.service;

import java.util.List;

import com.beans.Profile;

public interface ProfileService {
	public int store(Profile profile);
	public List<Profile> getProfiles();
}
