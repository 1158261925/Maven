package com.test.two;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test(groups={"orange"})
  public void test_001() {
	  System.out.println("�����@Test001������");
  }
  @Test(groups={"orange"})
  public void test_002() {
	  System.out.println("�����@Test002������");
  }
  @Test(groups={"banana"})
  public void test_003(){
	  System.out.println("�����@Test003����");
  }
  @Test(groups={"apple"})
  public void test_004(){
	  System.out.println("�����@Test004����");
  }
  @Test(groups={"apple"})
  public void test_005(){
	  System.out.println("�����@Test005����");
  }
  @BeforeMethod
  public void beforeMethod(){
	  System.out.println("�����@beforeMethod����");
  }
  @AfterMethod
  public void afterMethod(){
	  System.out.println("�����@afterMethod����");
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
