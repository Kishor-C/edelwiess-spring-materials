package com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beans.Profile;
import com.service.ProfileService;

@RestController
@RequestMapping("/api")
public class RestApi {
	@Autowired
	private ProfileService service;
	
	// URL: http://context-path/spring/api/test
	@RequestMapping(path = "/test",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> hello() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("message", "Hello RESTful webservice");
		map.put("error", "Sorry we got some error");
		return map;
	}
	@RequestMapping(method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> store(@RequestBody Profile profile) {
		int size = service.store(profile);
		Map<String, String> map = new HashMap<String, String>();
		map.put("status", "Size of list: "+size);
		return map;
	}
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Profile> fetchProfiles() {
		List<Profile> list = service.getProfiles();
		return list;
	}
}
