package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class signup {
	
	WebDriver driver= null;
	
	@SuppressWarnings("deprecation")
	@Given("user is on SignUp page")
	public void user_is_on_sign_up_page() {
	    
		System.out.println("Inside Step - user is on signup page");
        
		 System.setProperty("webdriver.chrome.driver", "C:/Users/mindsdet181/Downloads/BDD_Framework_NoBroker/src/test/resources/drivers/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.nobroker.in/");
	    
	    driver.findElement(By.xpath("//header/nav[@id='navHeader']/div[5]/div[2]/div[1]/div[1]")).click();
		
	}

	@When("user enters the valid data")
	public void user_enters_the_valid_data() {
	    
		System.out.println("Inside Step - User enters the valid data");
		
		driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).sendKeys("8552807738");
		
		
		driver.findElement(By.xpath("//input[@id='login-signup-form__name-input']")).sendKeys("Neha");
		driver.findElement(By.xpath("//input[@id='login-signup-form__email-input']")).sendKeys("nehamisal238@gmail.com");
		
	}

	@And("click on continue")
	public void click_on_continue() {
		
		System.out.println("clicks on continue");
		
		driver.findElement(By.xpath("//button[@id='signUpSubmit']")).click();
	    
	}

	@Then("user signed up sucessfully")
	public void user_signed_up_sucessfully() {
		
		System.out.println("user gets signed in successfully");
		
		driver.close();
	    
	}


}
