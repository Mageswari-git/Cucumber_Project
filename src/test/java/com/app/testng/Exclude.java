package com.app.testng;

import org.testng.annotations.Test;

public class Exclude {
	
@Test
	
	public void user() {
		System.out.println("username");
	}
    @Test
	public void pass() {
		System.out.println("password");
	}
	@Test
	
	public void login() {
		System.out.println("Login");
	}
	
}


