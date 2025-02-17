package Webauto;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamix {

	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		driver.findElement(By.id("email")).sendKeys("gokulkrish4022@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("610814114022");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Search' ]")).click();
		driver.findElement(By.xpath("//input[@aria-label]")).sendKeys("lauraharrier");
		driver.findElement(By.xpath("//div[text()='LAURA HARRIER • 1.1M followers']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		int j=1;
		try
		{
		for(int i=0;i<j;i++)
		{
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		j++;
		Thread.sleep(2000);
		}
		}
		catch(Throwable t)
		{
			System.out.println("pass");
		}
		driver.close();
	}

}
