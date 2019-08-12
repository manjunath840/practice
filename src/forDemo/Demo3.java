package forDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	
	@Test(priority=1)
	public void registerUser()
	{
		
		Reporter.log("hii", true);
	}
	
	@Test (priority=2)
	public void editUser()
	{
		Reporter.log("Bye.....", true);
	}
	
	
	@Test (dependsOnMethods= {"registerUser","editUser"})
	public void deleteUser()
	{
		Reporter.log("GoodMorning.....", true);
	}

}
