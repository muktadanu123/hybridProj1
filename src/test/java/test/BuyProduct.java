package test;

import org.testng.annotations.BeforeTest;

import resources.Base;

public class BuyProduct extends Base{

	@BeforeTest
	public void launchBrowser() throws Exception
	{
		initialize_Browser();
	}
	
}
