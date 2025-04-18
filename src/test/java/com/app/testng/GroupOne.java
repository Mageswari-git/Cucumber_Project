package com.app.testng;

import org.testng.annotations.Test;

public class GroupOne {
	
	//suite file

@Test(groups = {"smoke"})
	
	public void user() {
		System.out.println("username");
	}
@Test(groups = {"sanity"})
	public void pass() {
		System.out.println("password");
	}
	@Test(groups = {"smoke"})
	
	public void login() {
		System.out.println("Login");
	}
	
}


