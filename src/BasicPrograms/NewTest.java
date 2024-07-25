package BasicPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
 
  public void beforeTest() {
	  
  }
  
  public WebDriver driver;

	
	
    @BeforeTest
	public void Openurl() {
		driver =new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	}
    @Test
	public void Practiceform() {
		driver.findElement(By.id("firstName")).sendKeys("Rajesh");
	}


  @AfterTest
  public void afterTest() {
  }

}
