package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Careers {
	
	WebDriver driver= null;
	
	@SuppressWarnings("deprecation")
	@Given("user is at home page")
	public void user_is_at_home_page() {
	    
		System.out.println("Inside Step - user it at home page");
		 System.setProperty("webdriver.chrome.driver", "C:/Users/mindsdet181/Downloads/BDD_Framework_NoBroker/src/test/resources/drivers/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.nobroker.in/");
		
	}

	@When("user click on menu")
	public void user_click_on_menu() {
	    
		System.out.println("Inside Step - clicks on menu");
		driver.findElement(By.xpath("//header/nav[@id='navHeader']/div[5]/div[2]/div[3]/div[1]")).click();
		
	}

	@And("select career option")
	public void select_career_option() {
		
		System.out.println("Inside Step - select career option");
		driver.findElement(By.xpath("//header/nav[@id='navHeader']/div[5]/div[2]/div[3]/div[2]/a[10]")).click();

	}

	@Then("career page is open")
	public void career_page_is_open() throws InterruptedException {
		
		System.out.println("Inside Step - career page is open");
		
		Thread.sleep(3000);
		driver.close();
		
	}


}
