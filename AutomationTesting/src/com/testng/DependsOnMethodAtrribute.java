package com.testng;

import org.testng.annotations.Test;

public class DependsOnMethodAtrribute {

	@Test
	public void test1() {
		System.out.println("test11"); //1 execute
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2() {
		System.out.println("test22");//3 execute
	}
	
	@Test
	public void test3() {
		System.out.println("test33");//2  execute
	}
	
	@Test(dependsOnMethods = "test3")
	public void test4() {
		System.out.println("test44");//4 execute
	}
	

	@Test(dependsOnMethods = {"test7","test6"})
	public void test5() {
		System.out.println("test55"); //1 execute
	}
	

	@Test
	public void test6() {
		System.out.println("test66"); //1 execute
	}
	

	@Test
	public void test7() {
		System.out.println("test77"); //1 execute
	}
	

	@Test
	public void test8() {
		System.out.println("test88"); //1 execute
	}
	
	
}
/*op
test11
test33
test66
test77
test88
test22
test44
test55
PASSED: test1
PASSED: test3
PASSED: test6
PASSED: test7
PASSED: test8
PASSED: test2
PASSED: test4
PASSED: test5
*/