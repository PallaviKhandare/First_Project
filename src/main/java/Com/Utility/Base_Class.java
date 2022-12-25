package Com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	public static WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.get("https://www.facebook.com/login/");
    	driver.manage().window().maximize();
	}
    @AfterMethod
    public void tearDown() {
    	driver.close();
    	
    }

}
