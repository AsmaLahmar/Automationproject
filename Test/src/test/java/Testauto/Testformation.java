package Testauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Testformation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		String titrepage = driver.getTitle();
		
		if(titrepage.equals("Test Login | Practice Test Automation")) {
			
			System.out.println("Le titre de la page est correct");
			
			
		}
		
		else {
			System.out.println("Test Ko, le titre de la page est incorrect");
			
		}
				
	}	
		

	}


