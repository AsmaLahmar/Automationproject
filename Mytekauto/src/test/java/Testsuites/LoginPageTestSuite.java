package Testsuites;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.LoginPage;

public class LoginPageTestSuite {
@Test 
	public void LoginwithvalidCredentials() throws Exception {
		Config.ConfigChrome();
		Config.driver = new ChromeDriver();
		Config.maximisewindow();
		String url = "https://www.mytek.tn/customer/account/login/referer/aHR0cHM6Ly93d3cubXl0ZWsudG4vY3VzdG9tZXIvYWNjb3VudC9sb2dvdXRTdWNjZXNzLw~~/";
		Config.driver.get(url);
		
		LoginPage page = new LoginPage();
		
		page.LoginwithvalidCredentials("bbounguicha3@gmail.com", "Proservice");
	    
		page.verifCorrectLogin("Mon compte");	
		
		Config.driver.quit();
}	
     @Test 
    public void verifincorrectLogin() throws Exception {
        Config.ConfigChrome();
        Config.driver = new ChromeDriver();
        Config.maximisewindow();
        String url = "https://www.mytek.tn/customer/account/login/referer/aHR0cHM6Ly93d3cubXl0ZWsudG4vY3VzdG9tZXIvYWNjb3VudC9sb2dvdXRTdWNjZXNzLw~~/";
        Config.driver.get(url);
		
        LoginPage page = new LoginPage();
        
        page.LoginwithInvalidCredentials("bbounguicha3@gmail.com","5523626");
       
        page.verifincorrectLogin("CONNEXION CLIENT");
        Config.driver.quit();
        
        
		
	
		
}
}	
