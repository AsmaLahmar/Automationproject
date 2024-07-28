package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageXiaomi {
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
    List<WebElement> Menus;
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div/div/a/div/div[2]")
    List<WebElement> Submenus;
	@FindBy(xpath ="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement verifpage;
	
	public HomePageXiaomi () {
		PageFactory.initElements(Config.driver, this);
	}

	public void MousehoverMenuAndclickSubmenu(String MenuTitle, String Submenutite) throws Exception {
		try{
			Thread.sleep(8000);
		for(WebElement Menu: Menus) {
        System.out.println();
			if (Menu.getText().contains(MenuTitle)) {
                          Config.attente(10);
                          Config.actions = new Actions (Config.driver);
              			Config.actions.moveToElement(Menu).perform();
          for (WebElement Submenu: Submenus) {
					if(Submenu.getText().contains(Submenutite))
                      Thread.sleep(4000);
					  Submenu.click();
		
    				}
    			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
    			
    		}
    
      public String verifPage() {
    	String ActualText = verifpage.getText();
    	return ActualText;
    	
    }
}


