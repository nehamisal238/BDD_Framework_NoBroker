package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginNoBroker {
	
	WebDriver driver=null;
	
	@SuppressWarnings("deprecation")
	@Given("user is on NoBroker home page")
	public void user_is_on_no_broker_home_page() {
	    
		System.out.println("Inside Step - user is on home page");
		 System.setProperty("webdriver.chrome.driver", "C:/Users/mindsdet181/Downloads/BDD_Framework_NoBroker/src/test/resources/drivers/chromedriver.exe");
		
        driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.nobroker.in/");
	    
		
	}

	@And("clicks on log in")
	public void clicks_on_log_in() {
		
		System.out.println("Inside Step - user clicks on login in");
		
		driver.findElement(By.xpath("//header/nav[@id='navHeader']/div[5]/div[2]/div[2]/div[1]")).click();
		
	}

	@When("enters mobile number and Enter the password")
	public void enters_mobile_number_and_enter_the_password() {
		
		System.out.println("Inside Step - enters mobile number");
		
		driver.findElement(By.xpath("//input[@id='signUp-phoneNumber']")).sendKeys("8552807738");
		
	}

	@And("click on cotinue")
	public void click_on_cotinue() {
		
	    System.out.println("Inside Step - user clicks on continue and enter password");
	    
	    driver.findElement(By.xpath("//button[@id='signUpSubmit']")).click();
	    driver.findElement(By.xpath("//header/div[@id='login-signup-modal']/div[2]/div[1]/div[2]/div[2]/form[1]/div[4]/label[2]")).click();
	    
	    //Enter the password
	    driver.findElement(By.xpath("//input[@id='login-signup-form__password-input']")).sendKeys("Neha@0810");
	    
	    //click on continue
	    driver.findElement(By.xpath("//button[@id='signUpSubmit']")).click();
	    
	}

	@Then("user gets logged in Successfully")
	public void user_gets_logged_in_successfully() throws InterruptedException {
		
        System.out.println("Inside Step - user gets logged in successfully");
        
        //LogInfo.addScreenCaptureFromPath("/BDD_Framework_NoBroker/target");
        
        Thread.sleep(3000);
        driver.close();

	}


}
