package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class myclass {
	public static void main(String[] args) {

		System.out.println("HelloWorld");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shwetara\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new ChromeDriver();

		String expectedTitle = "About Us";

		String actualtitle = "";

		String baseUrl = "http://13.233.154.63:8081";

		driver1.get(baseUrl);

		actualtitle = driver1.getTitle();

		System.out.println("title is" + actualtitle);

		if (actualtitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
	
	 driver1.findElement(By.xpath("//a[@href='/content/about-us.php']")).click();
	System.out.println("element Home has been clicked successfully");
		    driver1.switchTo().defaultContent();
		    }
	}

