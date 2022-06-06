package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class NoBrokerSearch {
	
	WebDriver driver=null;
	
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
		
	    System.out.println("Inside Step - browser is open");
	    System.setProperty("webdriver.chrome.driver", "C:/Users/mindsdet181/Downloads/BDD_Framework_NoBroker/src/test/resources/drivers/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.nobroker.in/");
		
	}

	@When("user enters NoBroker url in search box")
	public void user_enters_no_broker_url_in_search_box() {
		
		System.out.println("Inside Step - user enter NoBroker url in search box");	
		
		//driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("https://www.nobroker.in/");
		
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		
		System.out.println("Inside Step - hits enter");	
		
		//driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys(Keys.ENTER);
		
		//Thread.sleep(3000);
		
	}

	@Then("user is navigated to NoBroker home page")
	public void user_is_navigated_to_no_broker_home_page() throws InterruptedException {
		
		System.out.println("Inside Step - user is navigated to NoBroker home page");
		
		driver.getPageSource().contains("Rent");
		
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
		
	}

}
