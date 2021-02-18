package com.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class AttributeAnnotation {
// description attribute
	@Test(description = "this is test1")
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@Test(description = "this is test3")
	public void test3() {
		System.out.println("test3");
	}

	//timeout
	
	@Test(timeOut = 2000)
	public void test4() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("hi priyesh");
	}
	@Test
	public void test5() {
		System.out.println("this is a test 5");
		throw new SkipException("hi this test 5 is skipped");// for skip test with msg 
	}

	
	//enabled
	@Test(enabled = false)
	public void test6() {
		System.out.println("test6"); /// skip this test in O/P during runtime and another below test cases  executed
	}
	
	@Test()
	public void test7() {
		System.out.println("test7");
	}
	@Test(enabled = true)
	public void test8() {
		System.out.println("test9");
	}
}
