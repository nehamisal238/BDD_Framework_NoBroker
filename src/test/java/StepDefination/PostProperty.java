package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class PostProperty {
	
	WebDriver driver= null;
	
	@Given("main page is open")
	public void main_page_is_open() {
	    
		System.out.println("Inside Step - home page is open");
		 System.setProperty("webdriver.chrome.driver", "C:/Users/mindsdet181/Downloads/BDD_Framework_NoBroker/src/test/resources/drivers/chromedriver.exe");
	    
	    driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.nobroker.in/");
	    
	}

	@And("user clicked on menu option")
	public void user_clicked_on_menu_option() {
	    
		System.out.println("Inside Step - clicked on menu option");
		
		driver.findElement(By.xpath("//header/nav[@id='navHeader']/div[5]/div[2]/div[3]/div[1]")).click();
		
	}

	@When("clicked on Post Your Property")
	public void clicked_on_post_your_property() {
	    
		System.out.println("Inside Step - clicked on Post Your Property");
		
		driver.findElement(By.xpath("//a[contains(text(),'Post Your Property')]")).click();
		
	}

	@And("enter details and enter on start posting your ad for free")
	public void enter_details_and_enter_on_start_posting_your_ad_for_free() {
	    
		System.out.println("Inside Step - enter details and enter on start posting your ad for free");
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Neha Misal");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("nehamisal238@gmail.com");
		driver.findElement(By.xpath("//input[@id='userPhone']")).sendKeys("8552807738");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/label[1]/div[1]")).click();
		driver.findElement(By.xpath("//button[@id='']")).click();
		
		
	}

	@Then("property posted successfully")
	public void property_posted_successfully() throws InterruptedException {
	    
		System.out.println("Inside Step - property posted successfully");
		
		Thread.sleep(3000);
		driver.close();
	}


}
