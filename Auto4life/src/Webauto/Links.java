package Webauto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();

		WebElement Link1 = driver.findElement(By.linkText("Go to Dashboard"));
		Link1.click();
		
		driver.navigate().back();
		
		WebElement Link2 = driver.findElement(By.partialLinkText("Find the URL"));
		String Tolink = Link2.getAttribute("href");
		System.out.println("The URL will navigate to " + Tolink);
		
		
		WebElement Link3 = driver.findElement(By.linkText("Broken?"));
		Link3.click();
		
		/* String isbroken =driver.getTitle();
		
		if (isbroken.contains("404")) {
			System.out.println("Link is broken");}
		
		else {
			System.out.println("Link is Not broken");
			}
		driver.navigate().back();

		List <WebElement> linkcount=driver.findElements(By.tagName("a"));
		int value = linkcount.size();
		
		System.out.println("Total number of link is " + value);		*/
		
	
	
	
	}
	}
		
		
		
		
		

		
	

