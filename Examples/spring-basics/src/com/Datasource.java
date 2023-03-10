package com;

public class Datasource {
	private String username;
	private String password;
	private String url;
	private String driverClass;
	
	public Datasource(String username, String password, String url, String driverClass) {
		super();
		System.out.println("Datasource object created...");
		this.username = username;
		this.password = password;
		this.url = url;
		this.driverClass = driverClass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	
	
}
