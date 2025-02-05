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

public class Telephoneportable {
@FindBy(xpath="/html/body/div[2]/main/div[4]/div[1]/div[3]/ol/li/div/div[2]/div/strong/a")
List<WebElement> TelephoneList;
@FindBy(xpath="/html/body/div[2]/main/div[2]/div[1]/div[1]/div[3]/div[1]/span")
WebElement Avaibility;
@FindBy(xpath="/html/body/div[2]/main/div[2]/div[2]/div[2]/form/div/div/div[2]/button")
WebElement Ajoutaupanier;
@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/a")
WebElement panier;
@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[4]/ol/li/div/div/strong")
WebElement verifproductpanier;

public Telephoneportable() {
	PageFactory.initElements(Config.driver, this);
}

public void clickonproductbyname (String productname) throws Exception {
	try {
	for (WebElement Telephone: TelephoneList) { 
		if (Telephone.getText().contains(productname)) {
			Telephone.click();
			WebDriverWait wait = new WebDriverWait(Config.driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(Ajoutaupanier));
			Assert.assertEquals(Avaibility.getText(), "En Stock");
			Ajoutaupanier.click();
			Thread.sleep(4000);
			
			panier.click();
			
			Assert.assertTrue(verifproductpanier.getText().contains(productname));
		
			Config.driver.quit();
			
			
		}
			
	}
}catch (Exception e) {
	// TODO: handle exception
}
}

}
