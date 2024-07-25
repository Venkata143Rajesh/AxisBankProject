package Systemsetproperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Gmail {
	public WebDriver driver;
	
	public void Openurl() {
		//System.setProperty("webdriver.chrome.driver", "G:\\System.setproperty concept\\chromedriver.exe\\");
		//System.setProperty("webdriver.chrome.driver", "E:\\Chromebrowser 24112023\\chromedriver-win64\\chromedriver.exe\\");
	//	System.setProperty("webdriver.chrome.driver", "E:\\Mana_Workspace2\\Chromebroser\\chromedriver-win64\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", "E:\\Mana_Workspace2\\Chromebroser\\chromedriver-win64\\chromedriver.exe"); 
		//driver = new ChromeDriver();
		 
		 driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		// driver = new InternetExplorerDriver();
		
	//	driver.get("https://www.google.com/");
		driver.get("https://www.savaari.com/");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmail G = new Gmail();
		//G.Openurl();
		G.Openurl();
		

	}

}
