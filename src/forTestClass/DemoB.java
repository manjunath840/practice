package forTestClass;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoB
{
	
	@BeforeMethod(alwaysRun=true)
	public void login()
	{
		Reporter.log("before method", true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		Reporter.log("logout method", true);
	}
	
	@Test(priority=1,groups= {"user", "smoke"})
	public void createUser()
	{
		Reporter.log("UserCreated", true);
	}
	
	
	@Test(priority=2,groups= "user")
	public void editUser()
	{
		Reporter.log("editUser", true);
	}
	

	@Test(priority=3,groups= "user")
	public void delete()
	{
		Reporter.log("deleteUSer", true);
	}
	
	@Test(priority=4,groups= {"task", "smoke"})
	public void createtask()
	{
		Reporter.log("createtask", true);
	}
	
	
	@Test(priority=5,groups= "task")
	public void edittask()
	{
		Reporter.log("edittask", true);
	}
	

	@Test(priority=6,groups= "task")
	public void deletetask()
	{
		Reporter.log("deletetask", true);
	}
	

}
