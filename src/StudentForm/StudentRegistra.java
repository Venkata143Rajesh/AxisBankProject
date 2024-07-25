package StudentForm;
//import of selenium jarfiles to run the program succefully.
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// set of class as studentRigistra
public class StudentRegistra {
// set of webdriver object driver	
public WebDriver driver;

public void Openurl() {
	//set up Chromedriver
	driver = new ChromeDriver();
	//set up urlpath
	driver.get("https://demoqa.com/automation-practice-form");
	//Windows maximize page
	driver.manage().window().maximize();
}
// writing method PracticeFrom
public void PracticeFrom() throws Exception { 
	// Details filling FirstName : Text box
	driver.findElement(By.id("firstName")).sendKeys("Venkata Rajesh");
	//Details filling LastName : Text box
	driver.findElement(By.id("lastName")).sendKeys("Chappa");
	//userEmail : Text box
	driver.findElement(By.id("userEmail")).sendKeys("rajeschv94@gmail.com");
	//Gender Male : radio button
	driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	//Mobile(10 Digits) : Text box
	driver.findElement(By.id("userNumber")).sendKeys("9182215877");
	//Date of Birth
	//Click
	driver.findElement(By.id("dateOfBirthInput")).click();
	//Month - July
	new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("July");
	//Year - 1994
	new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("1994");
	//Date - 27 Click Operation
    driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[4]")).click();
    //Subject: Text Box 
    driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).click(); // no need click operation here.
    // Maths
    driver.findElement(By.id("subjectsInput")).sendKeys("Maths"); 
    driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
//Hobbies
  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
  //Picture
 driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Admin\\OneDrive\\Desktop\\snap1.PNG");
 //currentAddress
 driver.findElement(By.id("currentAddress")).sendKeys("Vizag is a beatiful city");
 driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
 //State and City
 //State
 driver.switchTo().activeElement().sendKeys("NCR");
 driver.switchTo().activeElement().sendKeys(Keys.TAB);
 driver.switchTo().activeElement().sendKeys(Keys.TAB);
 Thread.sleep(3000);
 //City
 driver.switchTo().activeElement().sendKeys("Delhi");
 driver.switchTo().activeElement().sendKeys(Keys.TAB);
 driver.switchTo().activeElement().sendKeys(Keys.TAB);
 Thread.sleep(3000);
 //Submit
 driver.findElement(By.id("submit")).click();
 Thread.sleep(3000);
 //Close
 driver.findElement(By.id("closeLargeModal")).click();
 Thread.sleep(3000);
    

}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		StudentRegistra SR = new StudentRegistra();
		SR.Openurl();
	    SR.PracticeFrom();    

	}

}
