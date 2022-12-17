package app_java_6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class A {
	@Test
public void test1() {
	System.out.println("from test1");
}
	@Test
	public void test2() {
		System.out.println("from test2");
	}
	@Before
	public void beforeTest() {
		System.out.println("before test");
	}
	@After
	public void afterTest() {
		System.out.println("afterTest");
	}
	@BeforeClass
	public static void classmethod() {
		System.out.println("beforeClassmethod");
	}
	@AfterClass
	public static void afterclassmethod() {
		System.out.println("afterClassmethod");
	}
}
