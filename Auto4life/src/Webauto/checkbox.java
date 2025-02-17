package Webauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checkbox {
 
	WebDriver d;
	long starttime ;
	long endtime ;

	
	@BeforeTest	
	public void launchbrowser() {
		starttime =System.currentTimeMillis();
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	d = new ChromeDriver();
	d.get("https://www.leafground.com/checkbox.xhtml");
	}
	
	@Test(priority =1)
	public void javaclick() {
	WebElement java = d.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]"));
	java.click();
	
	}
	@Test(priority =0)
	public void isselect() {
	WebElement isselect = d.findElement(By.xpath("//*[@id=\'j_idt87:j_idt91\']/div[2]"));
	
	Boolean result = isselect.isSelected();
	
	System.out.println(result);
	}
	
	@Test (priority =2)
	public void togglecheck() {
	WebElement toggle = d.findElement(By.xpath("//*[@id=\'j_idt87:j_idt100\']/div[2]"));

	if (toggle.isDisplayed()) {
		toggle.click();
	}
	}
	
	@Test(priority =3)
	public void isenabled() {

	WebElement find = d.findElement(By.xpath("//*[@id=\'j_idt87:j_idt102\']/div[2]"));
	Boolean result1 = find.isEnabled();
	System.out.println(result1);
	}
	
	@AfterTest
	public void closebrowser() {
		d.quit();
		System.currentTimeMillis();
		long duration = starttime - endtime;
		System.out.println(duration);
	}
	}
	
