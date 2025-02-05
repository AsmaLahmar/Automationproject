package Testauto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytek2 {
    
	WebDriver driver; 
	
	@Before
    public void init() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		String url = "https://www.mytek.tn/customer/account/login/referer/aHR0cHM6Ly93d3cubXl0ZWsudG4vY3VzdG9tZXIvYWNjb3VudC9sb2dvdXRTdWNjZXNzLw~~/";
	    driver.manage().window().maximize();
		driver.get(url); 
	}
	
	@Test
    public void connexionwithvalidcredentials() throws Exception  {
		WebElement Email = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/input[1]"));
		Email.sendKeys("bbounguicha3@gmail.com");
		Thread.sleep(4000);
		WebElement Motdepasse = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/input[1]"));
        Motdepasse.sendKeys("Proservice" + Keys.ENTER);
        Thread.sleep(4000);
        String expectedText = "Mon compte";
        String actualText = driver.getTitle();
        Assert.assertEquals(expectedText, actualText);
       
        driver.quit(); 
        
  }		
	@Test
	public void connexionwithinvalidcredentials() throws Exception {
		WebElement Email = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/input[1]"));
        Email.sendKeys("bbounguicha3@gmail.com");
        Thread.sleep(4000);
        WebElement Motdepasse = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/input[1]"));
        Motdepasse.sendKeys("Incorrect");
        Thread.sleep(4000);
        WebElement btnconnexion = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[5]/div[1]/button[1]"));
	    btnconnexion.click();
	    Thread.sleep(4000);
	    
	    String expectedText = "CONNEXION CLIENT";
	    String actualText = driver.getTitle();
	    Assert.assertEquals(expectedText, actualText);
	    
	    driver.quit();
	    
	
	    
	
	
	}



}

