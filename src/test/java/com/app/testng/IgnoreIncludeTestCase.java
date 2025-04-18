package com.app.testng;

import org.testng.annotations.Test;

public class IgnoreIncludeTestCase {
	
	//we can use enabled method 
	//enabled =false will ignore the test case like @ignore
	//and also use suite file methods include 
	
	@Test(enabled=false)
	public void user() {
		System.out.println("user");
	}
	
	@Test 
	public void pass() {
		System.out.println("pass");
	}
	
	@Test
	public void login() {
		System.out.println("login");
	}
	

}



