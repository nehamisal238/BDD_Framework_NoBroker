package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Blog {
	
	WebDriver driver= null;
	
	@SuppressWarnings("deprecation")
	@Given("home page is open")
	public void home_page_is_open() {
	    
		System.out.println("Inside Step - home page is open");
        System.setProperty("webdriver.chrome.driver", "C:/Users/mindsdet181/Downloads/BDD_Framework_NoBroker/src/test/resources/drivers/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.nobroker.in/");
		
	}

	@When("click on menu")
	public void click_on_menu() {
	    
		System.out.println("Inside Step - click on menu");
		
		driver.findElement(By.xpath("//header/nav[@id='navHeader']/div[5]/div[2]/div[3]/div[1]")).click();
		
	}

	@SuppressWarnings("deprecation")
	@And("select Blog option")
	public void select_blog_option() {
	    
		System.out.println("Inside Step - select Blog option");
		
		driver.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}

	@Then("Blog page is open")
	public void blog_page_is_open() throws InterruptedException {
	    
		System.out.println("Inside Step - Blog page is open");
		
	    //Thread.sleep(1000);
	    driver.close();
	    driver.quit();
		
	}


}
