package Pages;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageMI {
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement> Menus;
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div")
    List<WebElement> Submenus;
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement verifSubmenuPage;
	
	
	public HomePageMI () {
		PageFactory.initElements(Config.driver, this);
	}
	public void MousehoverMenuAndclickSubmenu(String MenuTitle, String Submenutite) throws Exception {
		Thread.sleep(7000);
		for(WebElement Menu: Menus) {
			Thread.sleep(4000);
			if (Menu.getText().contains(MenuTitle)) {
				Config.Action = new Actions(Config.driver);
				Config.Action.moveToElement(Menu).perform();
				Config.attente(10);
				for (WebElement Submenu: Submenus) {
					if(Submenu.getText().contains(Submenutite)) {
						Submenu.click();
					}
				}
		
			}
		}
		
			
		}
	public String verificationPage() {
		String ActualMessage = verifSubmenuPage.getText();
		return ActualMessage;
		
	}

	}


