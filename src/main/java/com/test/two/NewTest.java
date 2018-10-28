package com.test.two;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void test_001() {
	  System.out.println("这个是@Test001方法！");
  }
  @Test
  public void test_002() {
	  System.out.println("这个是@Test002方法！");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("这个是@Beforeclass方法！");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("这个是@Afterclass方法！");
  }

}
