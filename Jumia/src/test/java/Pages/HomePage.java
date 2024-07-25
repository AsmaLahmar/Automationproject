package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {

	@FindBy(xpath="/html/body/div/main/div[1]/div[1]/div[1]/div/a/span")
	List<WebElement> menus ; 
	@FindBy(xpath="/html/body/div/main/div[1]/div[1]/div[1]/div/div[7]/div/div[1]/div[1]/a")
	List<WebElement> Submenus;

	@FindBy(xpath="/html/body/div/main/div[1]/div[1]/a[2]")
	WebElement verifmenu;
	@FindBy(xpath="/html/body/div/main/div[1]/div[1]/a[5]")
	WebElement verifSubmenu;
	@FindBy(id="fi-q")
	WebElement searchItem;
	@FindBy(xpath="/html/body/div/main/div[1]/div[1]/a[3]")
	WebElement verifsearch;
	@FindBy(xpath="/html/body/div[1]/div[3]/div/section/button")
	WebElement close;
	
	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
		
	}
	
	public void ClickOnMenuByName(String menutitle) {
		try {
		for(WebElement menu: menus) {
			if (menu.getText().contains(menutitle)) {
				menu.click();
				
				String ActualText= verifmenu.getText();
						Assert.assertEquals(menutitle, ActualText);
								
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
 public void MouseHoverOverMenuAndclickSubmenu(String menutitle, String Submentitle) {
	 try {
	 for (WebElement menu: menus) {
		 if (menu.getText().contains(menutitle)) {
			 Config.actions = new Actions(Config.driver);
			 Config.actions.moveToElement(menu).perform();
			 Thread.sleep(2000);
	for (WebElement Submenu : Submenus)	{
		System.out.println(Submenu.getText());
		if (Submenu.getText().contains(Submentitle)) {
			Submenu.click();
			Config.attente(10);
			String ActualText = verifSubmenu.getText();
			Assert.assertEquals(Submentitle, ActualText);
		}
	}
			 
		 }
	 }
	 }catch (Exception e) {
		// TODO: handle exception
	} 
 }
 public void RechercherProduit(String Nomproduct) {
	 searchItem.sendKeys(Nomproduct+ Keys.ENTER);
	 Config.attente(10);
	 String ActualText = verifsearch.getText();
	 Assert.assertEquals(Nomproduct, ActualText);
	 
 }
 public void closefenetre() throws Exception {
	 close.click();
	 Thread.sleep(3000);
 }
}
