package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {

	@Test
	public void testIndia() {
		System.out.println("india");
	}
	
	@Test
	public void stateTest() {
		System.out.println("maharashtra");
		Assert.assertEquals("priyesh", "priyesh");
	}
	
	@Test
	public void districtTest() {
		System.out.println("sangli");
		Assert.assertTrue(true, "this is true");
	}
	@Test
	public void talukaTest() {
		System.out.println("kadegaon");
		Assert.assertEquals("kadegaon", "kadegaon");
		System.out.println("after assertion");
	
	}
	@Test
	public void villageTest() {
		System.out.println("kadegaon main");
		try {
		Assert.assertEquals("kadegaon", "kadegaon");
		}catch(Exception e) {System.out.println(e);}
		System.out.println("after assertion failed");
	
	}

	@Test
	public void talukaTest1() {
		System.out.println("kadegaon");
		Assert.assertEquals("kadegaon", "kadegaon");
		System.out.println("after assertion");
	
	}
}
