package mytestpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mytestclass {

	public static void main (String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in");
		String i = driver.getCurrentUrl();
		System.out.println(i);
		driver.close();
	}
}
