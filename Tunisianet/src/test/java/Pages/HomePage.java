package Pages;


import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class HomePage {
	
	@FindBy(xpath="/html/body/main/header/div[2]/div/div/div[2]/div[1]/div[1]/form/input[4]")
	WebElement searchitem;
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/p")
	WebElement verifsearchitem;
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[1]/span")
	List<WebElement> menus;
	@FindBy (xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li[4]/div[2]/div/div[1]/ul/li/a")
	List<WebElement> submenus;
	@FindBy(xpath="/html/body/main/section/div/div/nav/ol/li[4]/a/span")
	WebElement verifpageproduit;
	
	
	public HomePage() {
		
		PageFactory.initElements(Config.driver, this);
		
	}
	
    public void rechercheproduit (String Nomproduct) {
    	searchitem.sendKeys(Nomproduct+Keys.ENTER);
    	WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.urlContains(Nomproduct));
    	Assert.assertTrue(verifsearchitem.getText().contains(Nomproduct));
        
    		
    	}
   public void mousehoverovermenu ( String menutitle, String submenutitle ) {
	   try {
	   for (WebElement menu : menus) {
		   if (menu.getText().contains(menutitle)) {
			  Config.actions.moveToElement(menu).perform();
			   
			  
			  for(WebElement submenu : submenus) {
				  if(submenu.getText().contains(submenutitle)) {
					  submenu.click();
					  String ActualText = verifpageproduit.getText();
					  Assert.assertEquals(submenutitle, ActualText);
					  
				  }
			  }
			  
		   }
	   }
   }catch (Exception e) {
	// TODO: handle exception
}
   }
   
    }

