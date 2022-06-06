package StepDefination;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	
	 static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver", "C:/Users/mindsdet181/Downloads/BDD_Framework_NoBroker/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	    driver.get("https://www.nobroker.in/");
		takeScreenshots("loginPage");
	}
   
	public static void takeScreenshots(String filename) throws IOException{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFiles(file, new File("C:/Users/mindsdet181/Downloads/BDD_Framework_NoBroker/Screenshot"+filename+".jpg"));
	}
}
