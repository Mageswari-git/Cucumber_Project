package com.app.testng;

import org.testng.annotations.Test;

public class GroupTwo {
	

	@Test(groups = {"smoke"})
	public void test1() {
		
		System.out.println("Test One");
		
		
	}
	@Test(groups = {"sanity"})
	public void test2() {
		
		System.out.println("Test Two");
		
		
	}
	@Test(groups = {"sanity"})
	public void test3() {
		
		System.out.println("Test Three");
		
		
	}

}
