package com.test.two;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test(groups={"orange"})
  public void test_001() {
	  System.out.println("这个是@Test001方法！");
  }
  @Test(groups={"orange"})
  public void test_002() {
	  System.out.println("这个是@Test002方法！");
  }
  @Test(groups={"banana"})
  public void test_003(){
	  System.out.println("这个是@Test003方法");
  }
  @Test(groups={"apple"})
  public void test_004(){
	  System.out.println("这个是@Test004方法");
  }
  @Test(groups={"apple"})
  public void test_005(){
	  System.out.println("这个是@Test005方法");
  }
  @BeforeMethod
  public void beforeMethod(){
	  System.out.println("这个是@beforeMethod方法");
  }
  @AfterMethod
  public void afterMethod(){
	  System.out.println("这个是@afterMethod方法");
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
