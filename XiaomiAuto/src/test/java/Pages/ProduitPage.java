package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class ProduitPage {

	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement> Products;
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement verifpageprodcut;

	public ProduitPage() {
		PageFactory.initElements(Config.driver,this);
	}
	
	
public void ClickOnProduct(String ProductName) {
		try {
		for(WebElement product: Products) {
			if (product.getText().contains(ProductName)) {
				product.click();			
				
}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
}
 
	public String verifproduct() {
		String ActualMessage = verifpageprodcut.getText();
		return ActualMessage;}
}
