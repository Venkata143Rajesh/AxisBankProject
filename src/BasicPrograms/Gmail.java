package BasicPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Gmail {
	
	public WebDriver driver;
	
	
	public void Openurl() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
     }
	
	public void Createaccount() {
	//	driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[3]/span[2]")).click();
		
		
	
		
	}
	public void login() {
		
		
	}
	public void logout() {
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmail r = new Gmail();
		r.Openurl();
		//r.Createaccount();
		
		

	}

}
