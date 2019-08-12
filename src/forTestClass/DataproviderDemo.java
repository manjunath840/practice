package forTestClass;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo 
{
	@DataProvider
	
	public Object[][]  getdata()
	{
	Object[][] data= new Object[2][2];
	
	data[0][0]="usernameA";
	data[0][1]="passA";
	data[1][0]="usernameB";
	data[1][1]="passB";
	return data;
	
	
	}
	
	@Test(dataProvider="getdata")
		public void createUser(Object un, Object pw)
		{
			
			Reporter.log(un+" "+pw, true);
		}

}
