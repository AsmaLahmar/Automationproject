package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div[2]/div/nav/ul/li[1]/a")
	WebElement Touslesrayons;
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div[2]/div/nav/ul/li[1]/div/ul/li/a")
    List<WebElement> Menus; 
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div[2]/div/nav/ul/li[1]/div/ul/li[1]/div/div/div[1]/ul/li/a/span")
	List<WebElement> Submenus;
	@FindBy(xpath= "//html/body/div[2]/main/div[1]/h1/span")
	WebElement Verifpage;
	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void Clickproduct(String MenuTitle, String SubMenuTitle) {
	   
		Config.action= new Actions (Config.driver);
		Config.action.moveToElement(Touslesrayons).perform();
		try {
		for(WebElement Menu : Menus) {
			
			if(Menu.getText().contains(MenuTitle)) {
			Config.action.moveToElement(Menu).perform();
			
		for (WebElement Submenu : Submenus) {
			if(Submenu.getText().contains(SubMenuTitle)) {
		    Submenu.click();
		    
			}
			}
			}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void verif (String SubMenuTitle) {
		String actualMessage = Verifpage.getText();
		Assert.assertEquals(SubMenuTitle, actualMessage);
	}
	}

