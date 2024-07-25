package BasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InfoCommends {
	
	public WebDriver driver;


	
	 
	  public void gmail() throws Exception {
		  
		  String str1 = driver.findElement(By.linkText("Gmail")).getText();
				  System.out.println(str1);

	  }
	  
	 
	
	  public void google_image() throws Exception {
		   
		 String str2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).getAttribute("alt");
				System.out.println(str2);
		 
		 
	  }
	  
	 
	  
  
	  public void searchbutton() throws Exception {
		  
	   
		 String str3 = driver.findElement(By.name("btnK")).getAttribute("value");
		System.out.println(str3);

		
	  }
	  
	  
	
	  public void beforeTest()  {
		  
			
		  driver = new FirefoxDriver();
		  driver.get("http://google.com");
		 driver.manage().window().maximize();
		   
		  
	  }

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InfoCommends obj=new InfoCommends();
		obj.beforeTest();
		obj.gmail();
		obj.google_image();
		obj.searchbutton();

	}

}
