package Pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class Ajoutproduitpanier {
@FindBy(xpath="/html/body/div/header/section/div[2]/a")
WebElement Listpanier;
@FindBy(xpath="/html/body/div/main/div[1]/section/div/div[2]/div[3]/div/form/button")
WebElement boutonacheter;
@FindBy(xpath="/html/body/div/main/div[2]/div[3]/section/div[1]/article/a[2]/div[2]/h3")
List<WebElement> Listepc;
@FindBy(xpath="html/body/div/main/div[1]/section/div/div[2]/div[1]/div/h1")
WebElement verifnomproduit;
@FindBy(xpath="/html/body/div/main/div/div[1]/article/article/a/div[2]/h3")
WebElement verifproduitpanier;

public Ajoutproduitpanier() {
	PageFactory.initElements(Config.driver, this);
	}
public void selectionnerProduit(String NamePc) throws Exception {
	try {
	for (WebElement pc : Listepc) {
		if(pc.getText().contains(NamePc)) {
			WebDriverWait wait = new WebDriverWait(Config.driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(pc));
			//pc.click();
			
			((JavascriptExecutor)Config.driver).executeScript("arguments[0].click();",pc);
			
			Config.attente(10);
			
			String AcutalText = verifnomproduit.getText();
			
		    Assert.assertEquals(AcutalText, NamePc);
			
			boutonacheter.click();
			Thread.sleep(4000);
			Listpanier.click();
			String NomProduit = verifproduitpanier.getText();
			Assert.assertTrue("Le Nom du pc est incorrect", NomProduit.contains(NamePc));
		}
	}
	
}catch (Exception e) {
	
	// TODO: handle exception
}
}

}
