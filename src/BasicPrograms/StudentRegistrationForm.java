package BasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StudentRegistrationForm {
	
	public WebDriver driver;
	
	
	
	public void Openurl() {
		driver =new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	public void Practiceform() throws Exception {
		//Name
		//FirstName
		driver.findElement(By.id("firstName")).sendKeys("Venkata Rajesh");
		//LastName
		driver.findElement(By.id("lastName")).sendKeys("Chappa");
		//Email
		driver.findElement(By.id("userEmail")).sendKeys("rajesch1994@gmail.com");
		//Gender
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		//Mobile(10 Digits)
		driver.findElement(By.id("userNumber")).sendKeys("91456213458");
		//Date of Birth
		driver.findElement(By.id("dateOfBirthInput")).click();
		new Select(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"))).selectByVisibleText("July");
		new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText("1994");
		driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, July 27th, 1994']")).click();
		//Subjects
		driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.TAB);
		//driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		//Hobbies
		driver.findElement(By.xpath("//label[normalize-space()='Reading']")).click();
		//Upload Picture
	    driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Admin\\OneDrive\\Desktop\\sanjay1.PNG");
	    //Current Address
	    driver.findElement(By.id("currentAddress")).sendKeys("Vizag Beach");
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

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StudentRegistrationForm sr = new StudentRegistrationForm();
		sr.Openurl();
		sr.Practiceform();

	}

}
