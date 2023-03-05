package com.dao;

import java.util.List;

import com.beans.Profile;

public interface ProfileDao {
	public int save(Profile profile);
	public List<Profile> fetchProfiles();
	public Profile fetchProfileById(int id);
}
