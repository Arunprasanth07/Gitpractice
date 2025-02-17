package Webauto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoselection {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete\']/button"));
		button.click();

		
		WebElement option = driver.findElement(By.id("j_idt87:auto-complete_input"));
		option.sendKeys("re");
		Thread.sleep(4000);
		
		List <WebElement> list =  driver.findElements(By.xpath("//*[@id=\'j_idt87:auto-complete\']/ul/li"));
		
		for (WebElement webElement : list) {
			
			if (webElement.getText().equals("ReactJs")) {
				webElement.click();
				System.out.println("You selected" + webElement);
				break;
			}
		}
		
		
		
		
		
		
	}

}
