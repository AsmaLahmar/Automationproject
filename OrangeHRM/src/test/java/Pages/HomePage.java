package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span")
    List<WebElement> menus;
	@FindBy(tagName="h6")
	WebElement verifpage;
	
	public HomePage () {
		PageFactory.initElements(Config.driver,this);
	}
	
	
	public void clickOnmenubyname (String MenuName) {
		try {
		for (WebElement menu : menus) {
			if (menu.getText().contains(MenuName)) {
				menu.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		}
	public String verifmenu() {
		String ActualMessage = verifpage.getText();
		return ActualMessage;
		
		
	}
}
