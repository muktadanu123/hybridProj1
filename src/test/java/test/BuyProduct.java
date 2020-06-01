package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomPackage.Homepage;
import pomPackage.LoginPage;
import resources.Base;

public class BuyProduct extends Base{

	@BeforeTest
	public void launchBrowser() throws Exception
	{
		initialize_Browser();
	}
	@Test(priority=1)
	public void login()
	{
		LoginPage login = new LoginPage(driver);
		login.getUser().sendKeys("8416004024");
		login.getPass().sendKeys("mukta-spsida");
		login.getBtn().click();
	}
	
	@Test(priority=2)
	public void enterItem() throws Exception
	{
		Homepage home = new Homepage(driver);
		Thread.sleep(3000);
		home.enterSearch().sendKeys("iphone",Keys.ENTER);
	}
}
