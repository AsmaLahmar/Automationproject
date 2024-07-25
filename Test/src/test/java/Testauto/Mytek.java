package Testauto;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytek {

	@Test
	public void Loginwithvalidcredentials() throws InterruptedException {
		
		//configuration driver chrome
		
		WebDriver driver = new ChromeDriver(); 
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
		String url = "https://www.mytek.tn/customer/account/login/referer/aHR0cHM6Ly93d3cubXl0ZWsudG4vY3VzdG9tZXIvYWNjb3VudC9sb2dvdXRTdWNjZXNzLw~~/";
		
		driver.get(url);
		
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("bbounguicha3@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		Thread.sleep(4000);
		password.sendKeys("Proservice"+Keys.ENTER);
		
		String expectedTest = "Mon compte";
		Thread.sleep(4000);
		String actualTest = driver.getTitle();
		
        Assert.assertEquals(expectedTest, actualTest);
        
        driver.quit();
        
  }
	@Test 
	public void Loginwithinvalidcredentials() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
	String url = "https://www.mytek.tn/customer/account/login/referer/aHR0cHM6Ly93d3cubXl0ZWsudG4vY3VzdG9tZXIvYWNjb3VudC9sb2dvdXRTdWNjZXNzLw~~/";
	driver.get(url);
	
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("bbounguicha3@gmail.com");
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("Proservice1");
	
	WebElement btnconnexion = driver.findElement(By.id("send2"));
	
	btnconnexion.click();
	
	String expectedText = "CONNEXION CLIENT";
	Thread.sleep(4000);
	
	String actualText = driver.getTitle();
	
	Assert.assertEquals(expectedText, actualText);
	
	driver.quit();
	
		
	}
}
