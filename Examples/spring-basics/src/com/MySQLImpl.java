package com;

public class MySQLImpl implements DBOperations {

	
	private Datasource ds; // spring can use setter or constructor injection
	
	public MySQLImpl() {
		System.out.println("MySQLImpl object created...");
	}
	
	@Override
	public void save(String name) {
		System.out.println("Connected to datasource: "+ds.getUrl());
		System.out.println(name+" saved in mysql db");
	}

	public void setDs(Datasource ds) {
		this.ds = ds;
	}
	
}
