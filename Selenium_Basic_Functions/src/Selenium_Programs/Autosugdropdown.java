package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugdropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Selenium_Basics\\Selenium_Basic_Functions\\chromedriver_win_32_1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		System.out.println("1");
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		WebElement sources = driver.findElement(By
				.xpath("//div[@id='react-autowhatever-1']/parent::div/input")); 
		// WebElement sources=
		// driver.findElement(By.cssSelector("input.react-autosuggest__input react-autosuggest__input--open"));
		System.out.println("2");
		sources.clear();
		sources.sendKeys("MUM");
		Thread.sleep(2000);
		sources.sendKeys(Keys.ENTER);
		sources.sendKeys(Keys.ARROW_DOWN);
		sources.sendKeys(Keys.ENTER);

	}
}
