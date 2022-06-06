package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class ReferAndEarn {
	
	WebDriver driver= null;
	
	@SuppressWarnings("deprecation")
	@Given("opened the home page")
	public void opened_the_home_page() {
	    
		System.out.println("Inside Step - user opened the home page");
		 System.setProperty("webdriver.chrome.driver", "C:/Users/mindsdet181/Downloads/BDD_Framework_NoBroker/src/test/resources/drivers/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.nobroker.in/");
		
	}

	@When("press click on menu")
	public void press_click_on_menu() {
	    
		System.out.println("user click on menu");
		
		driver.findElement(By.xpath("//header/nav[@id='navHeader']/div[5]/div[2]/div[3]/div[1]")).click();
		
	}

	@When("click Refer&Earn")
	public void click_refer_earn() {
	    
		System.out.println("Inside Step - click on Refer & Earn");
		
		driver.findElement(By.xpath("//a[contains(text(),'Refer & Earn')]")).click();
		
	}

	@Then("Refer&Earn page is open")
	public void refer_earn_page_is_open() throws InterruptedException {

        System.out.println("Inside Step - Refer&Earn page is open");
        
        Thread.sleep(3000);
        driver.close();
		
	}


}
