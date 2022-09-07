import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","/SeleniumDemo/Kuzhali/chromedriver.exe" );
	

		driver.manage().window().maximize();
		driver.get("http://www.google.com");

}

}