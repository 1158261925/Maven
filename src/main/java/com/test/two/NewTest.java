package com.test.two;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void test_001() {
	  System.out.println("�����@Test001������");
  }
  @Test
  public void test_002() {
	  System.out.println("�����@Test002������");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("�����@Beforeclass������");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("�����@Afterclass������");
  }

}
