package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class links_Test {
	WebDriver d;
	long starttime;
	long endtime;
	
	@BeforeTest
	public void launchbrowser() {
	 starttime = System.currentTimeMillis();
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 d = new ChromeDriver();
	d.navigate().to("https://www.leafground.com/link.xhtml");
	}
	@Test (priority = 0)
	public void todash() {
	WebElement Link1 = d.findElement(By.linkText("Go to Dashboard"));
	Link1.click();
	}
	@Test (priority = 1)
	public void backtolink() {
	d.navigate().back();
	}
	@Test (priority = 2)
	public void torandom() {

	WebElement Link2 = d.findElement(By.partialLinkText("Find the URL"));
	String Tolink = Link2.getAttribute("href");
	System.out.println("The URL will navigate to " + Tolink);
	}
	@Test (priority = 3)
	public void tobroken() {
	WebElement Link3 = d.findElement(By.linkText("Broken?"));
	Link3.click();
	}
	@AfterTest
	public void closebrowser () {
		d.quit();
		endtime = System.currentTimeMillis();
		Long duration = starttime - endtime;
		System.out.println("Test duration is : "+ duration);
	}
	

	
	
}
