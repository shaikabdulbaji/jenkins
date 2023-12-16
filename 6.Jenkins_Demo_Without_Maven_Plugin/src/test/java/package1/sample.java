package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
	@Test
	public void sanityTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		Thread.sleep(2000);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println("Current Page URL ==>" + driver.getTitle());
				
		driver.quit();
	}

}
