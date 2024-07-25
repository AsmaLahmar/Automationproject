package Pages;


import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class AjoutproduitPanier {
	
	
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
	WebElement btnajoutpanier;
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div[1]/a/span/i")
	WebElement btnpanier;
	@FindBy(xpath="/html/body/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div/div/div/ul/li/div[2]/a[1]")
	WebElement verifproduitpanier;
	
	
	public AjoutproduitPanier() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void AddproductToCart () throws Exception {
		btnajoutpanier.click();
		WebDriverWait wait = new WebDriverWait(Config.driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnajoutpanier));
		Thread.sleep(2000);
	}
	
	public String verifproduitPanier () throws Exception {
		
		btnpanier.click();
		Thread.sleep(4000);
		String ActualMessage = verifproduitpanier.getText();
		return ActualMessage;
		
		
	}
}
