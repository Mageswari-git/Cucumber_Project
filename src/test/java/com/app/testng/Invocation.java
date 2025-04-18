package com.app.testng;

import org.testng.annotations.Test;

public class Invocation {
	//particular test case will run ex:100 times(run here)(no suite)
	
	@Test(invocationCount = 100)
	public void user() {
		System.out.println("username");
	}

}
