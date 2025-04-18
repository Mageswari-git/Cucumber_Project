package com.app.testng;

import org.testng.annotations.Test;

 // it will give priority here password is having dependency on username so first username will execute
//instead of priority
public class DependsOn {
	@Test
	public void user() {
		System.out.println("username");
	}
    @Test(dependsOnMethods = "user")
	public void pass() {
		System.out.println("password");
	}


}
