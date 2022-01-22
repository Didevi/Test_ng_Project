package EndToEndProject.Testng_Framework;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.resources.Base_Class;

import Page_Object_Module.Login_page_object;

public class Verify_Login extends Base_Class {
	@Test(dataProvider="Getdata")
	
	public void browser_launch (String username , String password) throws IOException, InterruptedException {
		
		driver = driver_initialization();
		driver.get("https://login.salesforce.com/?locale=eu");
		Login_page_object obj = new Login_page_object (driver);
		obj.getusername().sendKeys(username);
		Thread.sleep(5000);
		obj.getpassword().sendKeys(password);
		Thread.sleep(5000);
		obj.getlogin().click();
		
	}
	

	

	@DataProvider
	public Object [][]Getdata(){              //Getdata is dataprovider
		Object[][] obj = new Object [2][2];
		obj[0][0]="Username1";
		obj[0][1]="1234";
		obj[1][0]="Username2";
		obj[1][1]="5678";
		return obj;
	}


}

