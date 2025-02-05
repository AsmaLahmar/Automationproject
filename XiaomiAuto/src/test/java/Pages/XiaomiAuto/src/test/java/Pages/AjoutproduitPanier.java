package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AjoutproduitPanier {
	@FindBy(xpath="//html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
	WebElement btnajoutpanier;
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div[1]/a/span/i")
	WebElement btnpanier;
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/ul/li/div[2]/a[1]/span")
	WebElement verifproduitpanier;
	
	public AjoutproduitPanier() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void AddproductToCart () throws Exception {
		Thread.sleep(4000);
		btnajoutpanier.click();
	}
	public void  Panier() throws Exception {
		Thread.sleep(4000);
		btnpanier.click();
	}
	
	
	public String verifproduitPanier () throws Exception {
		
	
		Thread.sleep(4000);
		String ActualMessage = verifproduitpanier.getText();
		return ActualMessage;

	}
}
