package com.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.beans.Profile;

//@Repository
public class ProfileDaoJdbcTemplateImpl implements ProfileDao {

	// we need to auto-wire JdbcTemplate to run SQL queries
	@Autowired
	private JdbcTemplate jdbc; // connects to Derby database
	
	@Override
	public int save(Profile profile) {
		// profile will have name, phone, birthday but profileId must be auto-generated
		String sqlQuery = "insert into profile values(next value for profile_seq, ?, ?, ?)";
		int rows = jdbc.update(sqlQuery, profile.getName(), Date.valueOf(profile.getBirthday()), profile.getPhone());
		return rows;
	}

	@Override
	public List<Profile> fetchProfiles() {
		String sqlQuery = "select * from profile";
		List<Profile> list = jdbc.query(sqlQuery, new ProfileResultMapper());
		return list;
	}

	@Override
	public Profile fetchProfileById(int id) {
		String sqlQuery = "select * from profile where profile_id = ?";
		Profile profile = jdbc.queryForObject(sqlQuery, new ProfileResultMapper(), id);
		return profile;
	}
	
}
