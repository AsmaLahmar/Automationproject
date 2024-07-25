package Pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class DisqueSSD {
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	List<WebElement> SSDList;
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[3]/span")
	WebElement Avaibility;
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[4]/form/div[2]/div/div[2]/button")
	WebElement ajoutaupanier;
	@FindBy(xpath="/html/body/div[8]/div/div/div/div[2]/div/div/button")
	WebElement boutoncontinuerpopup;
	@FindBy(xpath="/html/body/main/header/div[2]/div/div/div[2]/div[4]/div/div/a")
	WebElement panier;
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div/div/div[1]/div[2]/ul/li[2]/div/div[2]/div[1]/a")
	WebElement verifproduitpanier;
	
	
	public DisqueSSD () {
		PageFactory.initElements(Config.driver, this);
	}
	
    public void clickonproductbyname ( String Nameproduit) throws Exception {
    	try {
    	for (WebElement SSD : SSDList ) {
    		if (SSD.getText().contains(Nameproduit)) {
    			SSD.click();
    			Assert.assertEquals(Avaibility.getText(), "En stock");
    			ajoutaupanier.click();
    			WebDriverWait wait = new WebDriverWait(Config.driver,Duration.ofSeconds(10));
    			wait.until(ExpectedConditions.elementToBeClickable(ajoutaupanier));
    			Thread.sleep(4000);
    			boutoncontinuerpopup.click();
    			Thread.sleep(4000);
    			panier.click();
    			Assert.assertTrue(verifproduitpanier.getText().contains(Nameproduit));
    			
    		}
    	}
    }catch (Exception e) {
		// TODO: handle exception
	}
    }
}
