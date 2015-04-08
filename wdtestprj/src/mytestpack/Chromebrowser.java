package mytestpack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {
	public static void main (String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		if(driver.findElement(By.id("sb_ifc0")).isEnabled())
		{
			System.out.println("Google search text box Is enabled.");
			driver.findElement(By.id("sb_ifc0")).sendKeys("WebDriver Test successful.");
			driver.findElement(By.id("sb_ifc0")).click();
			System.out.println("Google search completed.");
		}
		else{
			System.out.println("Google search test box Is Not enabled.");
		}
	driver.close();
	}
}
