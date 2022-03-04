package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.Login;
import com.UtilityLayer.ExcelReader;

public class LoginTest extends BaseClass{
	private Login login;
	
	@BeforeClass
	public void setUp()
	{
		BaseClass.initialization();
		login = new Login();
	}
	
	@Test(priority = 1, groups = "LoginPage" )
	public void validateUsername()
	{
		boolean actualUsernameDisplayStatus = login.usernameDisplayStatus();
		Assert.assertEquals(actualUsernameDisplayStatus, true);
	
		boolean actualUsernameEnableStatus = login.usernameEnableStatus();	
		Assert.assertEquals(actualUsernameEnableStatus, true);	
	}
	
	
	@Test(priority = 2, groups = "LoginPage")
	public void validatePassword()
	{	
		boolean actualPasswordDisplayStatus = login.passwordDisplayStatus();
		Assert.assertEquals(actualPasswordDisplayStatus, true);
		
		boolean actualPasswordEnableStatus = login.passwordEnableStatus();
		Assert.assertEquals(actualPasswordEnableStatus, true);
	}
	
	@Test(priority = 3, groups = "LoginPage")
	public void validateLoginButton()
	{
		boolean actualButtonDisplayStatus   = login.loginButtonDisplayStatus();
		Assert.assertEquals(actualButtonDisplayStatus, true);
	
		boolean actualButtonEnableStatus   = login.loginButtonEnableStatus();
		Assert.assertEquals(actualButtonEnableStatus, true);
	}
	
	@Test(priority = 4, groups = "LoginPage", dataProvider = "Credentials")
	public void enterCredentials(String username, String password)
	{
		login.enterUsername(username);
		login.enterPassword(password);
	}
	
	@Test(priority = 5, groups = "LoginPage")
	public void getValues()
	{
		String user    = login.getUsername();
		String pass    = login.getPassword();
//		String button  = login.getButtonValue();
		Assert.assertEquals(user,"Admin");
		Assert.assertEquals(pass,"admin123");
	}
	
	@Test(priority = 6, groups = "LoginPage")
	public void loginToWebsite()
	{
		login.clickOnLogin();
	}
	
	@DataProvider(name = "Credentials")
	public Object[][] getData()
	{
		ExcelReader er = new ExcelReader("C:\\Users\\User\\Desktop\\Automation class\\Login.xlsx");
		int rows = er.getTotalRows(0);
		int cols = er.getTotalCells(0);
		
		Object[][] obj = new Object[rows][cols];
		for(int i = 0 ;i < rows ; i++)
		{
			obj[i][0] = er.getCellValue(0, i, 0);
			obj[i][1] = er.getCellValue(0, i, 1);
		}
		return obj;
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
