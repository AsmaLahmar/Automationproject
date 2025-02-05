package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	
	@FindBy(xpath="/html/body/div[1]/header/section/header/div[2]/div[2]/nav/ul/li/button/span")
	List<WebElement> menus ;
	@FindBy(xpath="/html/body/div[1]/header/section/header/div[2]/div[2]/nav/ul/li[3]/ul/li/button")
	List<WebElement> submenus;
	@FindBy(xpath="/html/body/div[1]/header/section/header/div[2]/div[2]/nav/ul/li[3]/ul/li[3]/ul/li/a")
    List<WebElement> products;
	@FindBy(xpath="/html/body/main/div[2]/section[2]/div[1]/div/div/h1/span")
	WebElement verifpage;
	
	public HomePage () {
		PageFactory.initElements(Config.driver, this);
	}
	
	
	public void selectProduct (String MenuName,String SubmenuName) throws Exception   {
	        Thread.sleep(5000);
	        for (WebElement menu:menus) {
	        	System.out.println(menu.getText());
			if(menu.getText().contains(MenuName)) {
				Config.actions = new Actions (Config.driver);
				Config.actions.moveToElement(menu).perform();
				Config.attente(10);
				for (WebElement submenu:submenus) {
					if(submenu.getText().contains(SubmenuName))
						Config.actions.moveToElement(submenu).perform();
					
				}
							}
		}
		}

		
	  public void clickonProduct (String productName) {
	try {
		for(WebElement product:products) {
			if (product.getText().contains(productName))
				product.click();
		}
	
		}catch (Exception e) {
			// TODO: handle exception
		}
	  }
		
	
	public String verification () {
		String ActualMessage = verifpage.getText();
		return ActualMessage;
		
	}
}
