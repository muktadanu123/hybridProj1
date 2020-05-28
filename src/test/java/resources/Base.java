package resources;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
public static WebDriver driver;
	public WebDriver initialize_Browser() throws Exception
	{
		String browser = System.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user-pc\\Desktop\\eclipse\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\user-pc\\Desktop\\eclipse\\gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Wrong input");
		}
		driver.manage().window().maximize();
		Properties prop = new Properties();
		FileInputStream f = new FileInputStream("C:\\Users\\user-pc\\Desktop\\eclipse\\my_projects\\hybridProj1\\src\\test\\java\\resources\\global.properties");
		prop.load(f);
		String url = prop.getProperty("url");
		driver.get(url);
		return driver;
	}
}
