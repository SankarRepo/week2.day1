package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		// setup the browser driver
		WebDriverManager.chromedriver().setup();
		String driverPath = System.getProperty("webdriver.chrome.driver");
		System.out.println(driverPath);
		
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// Enter the username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		
		//Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("TESTLEAF");
		
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Sankar");
		
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Varadarajan");
	
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("san");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software testing is a part of the software development team. Primarily performs the testing of the software been developed and to identify the defects");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sankar@testleaf.com");
		
		WebElement stateSelector = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select ss = new Select(stateSelector);
		ss.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("View Lead | opentaps CRM"))
			System.out.println("Title is matching");
		
		else 
			System.out.println("Title is not matching");
	
		
	
		
	}

}


/* 1. Launch URL "http://leaftaps.com/opentaps/control/login"
2. Enter UserName and Password Using Id Locator
3. Click on Login Button using Class Locator
4. Click on CRM/SFA Link
5. Click on Leads Button
6. Click on Create Lead 
7. Enter CompanyName Field Using id Locator
8. Enter FirstName Field Using id Locator
9. Enter LastName Field Using id Locator
10. Enter FirstName(Local) Field Using id Locator
11. Enter Department Field Using any Locator of Your Choice
12. Enter Description Field Using any Locator of your choice 
13. Enter your email in the E-mail address Field using the locator of your choice
14. Select State/Province as NewYork Using Visible Text
15. Click on Create Button
16. Get the Title of Resulting Page. refer the video  using driver.getTitle()*/
