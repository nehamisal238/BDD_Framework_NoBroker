package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class ContactUs {
	
	WebDriver driver= null;
	
	@SuppressWarnings("deprecation")
	@Given("NOBroker page is open")
	public void no_broker_page_is_open() {
	    
		System.out.println("Inside Step - home page is open");
		 System.setProperty("webdriver.chrome.driver", "C:/Users/mindsdet181/Downloads/BDD_Framework_NoBroker/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.nobroker.in/");
		
	}

	@When("click on menu toggle")
	public void click_on_menu_toggle() {
	    
		System.out.println("Inside Step - click on menu");
		
		driver.findElement(By.xpath("//header/nav[@id='navHeader']/div[5]/div[2]/div[3]/div[1]")).click();
		
	}

	@And("click on given email Id")
	public void click_on_given_email_id() {
	    
		System.out.println("Inside Step - Click on given mail Id");
		driver.findElement(By.xpath("//a[contains(text(),'hello@nobroker.in')]")).click();
		
	}

	@Then("contact us page is open")
	public void contact_us_page_is_open() throws InterruptedException {
	    
		System.out.println("Inside Step - Contact us page is open");
		Thread.sleep(3000);
		driver.close();
		
	}


}
