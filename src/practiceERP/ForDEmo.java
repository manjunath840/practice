package practiceERP;

import static org.junit.Assert.fail;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ForDEmo
{
	@Test 
	public void registerUser()
	{
		Reporter.log("register", true);
	}
	
	@Test 
	public void EditUser()
	{
		Reporter.log("Edit", true);
		Assert.fail();

	}
	
	public void PostCondition(ITestResult res)
	{
		int status= res.getStatus();
		Reporter.log("the status is="+status, true);
		String name= res.getName();
		Reporter.log("the Name is ="+name, true);
	}
}



