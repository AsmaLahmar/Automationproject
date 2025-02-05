package Testsuites;


import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	@Given("Admin is on Login page")
	public void admin_is_on_login_page() {
	Config.confChrome();
	Config.driver = new ChromeDriver();
	Config.maximizewindow();
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			Config.driver.get(url);
	
	}

	@When("Admin enters correct username {string} and correct password {string}")
	public void admin_enters_correct_username_and_correct_password(String username, String Password) {
		LoginPage page = new LoginPage ();
		
				page.connect(username, Password);
	    
	}

	@Then("Admin is directed to the Homepage that contains message {string}")
	public void admin_is_directed_to_the_homepage_that_contains_message(String ExpectedText) {
		
		LoginPage page = new LoginPage ();
		String ActualText = page.verifMessagelogin();
		Assert.assertEquals(ExpectedText, ActualText);
		Config.driver.quit();
	}
	
	@When("Admin enters correct username {string} and wrong password {string}")
	public void admin_enters_correct_username_and_wrong_password(String username , String password ) {
       LoginPage page = new LoginPage();
       page.connect(username, password);
	}

	@Then("Admin is not directed to the Homepage and an error message shows containing {string}")
	public void admin_is_not_directed_to_the_homepage_and_an_error_message_shows_containing(String ExpectedText) {
	    LoginPage page = new LoginPage();
	    String ActualText = page.verifLogin();
	    Assert.assertEquals(ExpectedText, ActualText);
	    Config.driver.quit();
	}
}
