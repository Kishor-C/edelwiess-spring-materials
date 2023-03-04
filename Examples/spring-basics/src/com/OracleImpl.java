package com;

public class OracleImpl implements DBOperations {

	@Override
	public void save(String name) {
		System.out.println(name+" saved in oracle db");
	}

}
