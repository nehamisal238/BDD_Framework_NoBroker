package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class PaintingCleaning {
	
	WebDriver driver= null;
	
	@SuppressWarnings("deprecation")
	@Given("end user opens the home page")
	public void end_user_opens_the_home_page() {
	    
		System.out.println("Inside Step - User is on home page");
		 System.setProperty("webdriver.chrome.driver", "C:/Users/mindsdet181/Downloads/BDD_Framework_NoBroker/src/test/resources/drivers/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.nobroker.in/");
		
	}

	@When("end user click on menu")
	public void end_user_click_on_menu() {
		
		System.out.println("Inside Step - user click on menu");
		
		driver.findElement(By.xpath("//header/nav[@id='navHeader']/div[5]/div[2]/div[3]/div[1]")).click();

	}

	@And("click on Painting & Cleaning")
	public void click_on_painting_cleaning() {
	    
		System.out.println("Inside Step - user click on Painting & Cleaning");
		
		driver.findElement(By.xpath("//a[contains(text(),'Painting & Cleaning')]")).click();
		
	}

	@Then("select city and page will open")
	public void select_city_and_page_will_open() throws InterruptedException {
	    
		System.out.println("Inside Step - Selected city and page is opened");
		
		driver.findElement(By.xpath("//body/div[@id='appPortal']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
