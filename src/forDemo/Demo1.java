package forDemo;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

	public class Demo1
	{
		@Test
		public void testA()
		{
			Reporter.log("AAA", true);
		}
		
		@Test
		public void testB()
		{
			Reporter.log("BBB", true);
		}
		
		
		@AfterMethod
		public void PostCondition(ITestResult res)
		{
			int status= res.getStatus();
			Reporter.log("Status: "+status, true);
			
			String name= res.getName();
			Reporter.log("Name: "+name, true);
		}
		

	}


