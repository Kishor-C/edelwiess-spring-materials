package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.beans.Profile;

public class ProfileResultMapper implements RowMapper<Profile>{

	@Override
	public Profile mapRow(ResultSet rs, int rowNum) throws SQLException {
		// create profile object and set values to profile properties from the result-set
		Profile profile = new Profile();
		profile.setProfileId(rs.getInt("profile_id"));
		profile.setName(rs.getString("name"));
		profile.setBirthday(rs.getDate("birthday").toLocalDate()); // sql.Date will be converted to LocalDate
		profile.setPhone(rs.getLong("phone"));
		return profile;
	}
}

