package Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Runner {
WebDriver driver;
@Test
public void test() 
{
	System.out.println(driver.getTitle());
	//System.out.println("hmmmmmmm");
	}
@BeforeTest
public void beforeTest()
{
	System.setProperty("webdriver.gecko.driver", "/gecko/geckodriver");
	//System.setProperty("webdriver.gecko.driver", "E:\\SHARED\\geckodriver\\geckodriver.exe");
	System.out.println("helllooo");
	driver= new FirefoxDriver();
	driver.get("http://www.facebook.com");

}
@AfterTest
public void afterTest(){
	System.out.println("Running1");
}
}
