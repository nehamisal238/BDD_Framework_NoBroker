package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class RentProperty {
	
	@SuppressWarnings("deprecation")
	@Given("user is on main page")
	public void user_is_on_main_page() {
		
		WebDriver driver = null;
	    
		System.out.println("Inside Step - user is on main page");
		
		 System.setProperty("webdriver.chrome.driver", "C:/Users/mindsdet181/Downloads/BDD_Framework_NoBroker/src/test/resources/drivers/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.nobroker.in/");

		
	}

	@SuppressWarnings("null")
	@And("user select location and enter the landmark")
	public void user_select_location_and_enter_the_landmark() {
	    
		System.out.println("Inside Step - user selects pune and enter landmark");
		
		By driver = null;
		//driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		driver.findElement((SearchContext) By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		
		driver.findElement((SearchContext) By.xpath("//input[@id='listPageSearchLocality']")).sendKeys("Whitefield");
		
				
	}

	@SuppressWarnings("null")
	@When("select full house")
	public void select_full_house() {
	    
		System.out.println("Inside Step - select full house option");
		By driver = null;
		driver.findElement((SearchContext) By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[5]/label[1]")).click();
		
	}

	@SuppressWarnings("null")
	@And("click on search")
	public void click_on_search() {
	    
		System.out.println("Inside Step - user click on search");
		By driver = null;
		driver.findElement((SearchContext) By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[4]/button[1]")).click();
		
	}

	@SuppressWarnings("null")
	@Then("listed properties are visible")
	public void listed_properties_are_visible() throws InterruptedException {
		
	    System.out.println("Inside Step - listed properties are visible");
	    
	    Thread.sleep(3000);
	    WebDriver driver = null;
		driver.close();
	    
	}


}
