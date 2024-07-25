package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {

@FindBy(xpath="/html/body/div[2]/main/div[3]/div/div[2]/div[1]/div[2]/form/fieldset/div[2]/div/input")
WebElement Email;
@FindBy(id = "pass" )
WebElement password;
@FindBy(id="send2")
WebElement btnconnexion;


public LoginPage() {
	PageFactory.initElements(Config.driver, this);
}
public void LoginwithvalidCredentials(String username, String pwd) throws Exception {

	Email.sendKeys(username);
	password.sendKeys(pwd);
	Thread.sleep(4000);
	btnconnexion.click();
	Thread.sleep(4000);
}
public void verifCorrectLogin(String Titrepage ) {	
	   String actualMessage = Config.driver.getTitle();
	   Assert.assertEquals(Titrepage , actualMessage);
	   
}   
public void LoginwithInvalidCredentials(String username, String pwd ) throws Exception  {

	Email.sendKeys(username);
	password.sendKeys(pwd);
	Thread.sleep(4000);
	btnconnexion.click();
	Thread.sleep(4000);
}
 
public void verifincorrectLogin(String Titrepage ) {
	String actualMessage = Config.driver.getTitle();
	Assert.assertEquals(Titrepage , actualMessage);
	
	
}
}