package Testauto;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	@Test
	public void loginWithValidCredentials() {
		
		//configuration du driver chrome
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("Password123");
		
		WebElement btnsubmit = driver.findElement(By.id("submit"));
		System.out.println(driver.getTitle());
		
		
		btnsubmit.click();
	    
		// verification de la connexion 
		
		String verifTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		
		
		if(verifTitle.equals("Logged In Successfully | Practice Test Automation")) {
			System.out.println("La connexion est établie");
		}
				
		else {
			System.out.println("Erreur login");
			
		}
		
		
		
	}
	
	@Test
    public void loginWithInvalidCredentials() {
		
		//configuration du driver chrome
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("password123");
		
		WebElement btnsubmit = driver.findElement(By.id("submit"));
		
		btnsubmit.click();
		
		// verfication de connexion 
		
		
		String verifTitle = driver.getTitle();
		
		if(verifTitle.equals("Test Login | Practice Test Automation")) {
		
		System.out.println("Test ok");
		}
		
		else { 
			System.out.println("Test KO");
		}
		}
    	
    }

