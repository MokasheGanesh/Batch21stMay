package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassB_TestNG {

	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass_ClassB");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod_ClassB");
		
	}
	
	@Test ()
	public void TestA()
	{
		System.out.println("testA_ClassB");
	}
	
	
	@Test()
	public void TestB() throws InterruptedException
	{
		
		System.out.println("testB_ClassB");
		
	}
	
	@Test()
	public void TestC()
	{
		System.out.println("testC_ClassB");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod_ClassB");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass_ClassB");
	}
	
	
	
	
	
	
	
}
