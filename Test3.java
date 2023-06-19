package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		Thread.sleep(3000);
		driver.get("https://www.getcalley.com/404-page-not-found/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	 	js.executeScript("window.scrollBy(0,1000)");

	 	Thread.sleep(3000);
	}
}

