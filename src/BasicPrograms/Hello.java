package BasicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hello {
	public WebDriver driver;
	
	public void Openurl() {
		System.setProperty("webdriver.chrome.driver","E:\\Chromebrowser 24112023\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello r = new Hello();
		r.Openurl();
	
		
	
	}

}
