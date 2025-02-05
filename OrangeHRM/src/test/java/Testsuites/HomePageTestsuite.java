package Testsuites;


import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageTestsuite {
	
	
	@Given("Admin is on the HomePage")
	public void admin_is_on_the_home_page() {
		Config.confChrome();
		Config.driver = new ChromeDriver();
		Config.maximizewindow();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Config.driver.get(url);
	   
	}

	@When("Admin clicks on menu name {string}")
	public void admin_clicks_on_menu_name(String MenuName) {
	 HomePage home = new HomePage();
	 home.clickOnmenubyname(MenuName);
	}

	@Then("Admin is directed to the page that contains the name of the {string}")
	public void admin_is_directed_to_the_page_that_contains_the_name_of_the(String ExpectedMessage) {
		HomePage home = new HomePage();
		String ActualMessage = home.verifmenu();
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		Config.driver.quit();
		
	  
	}

}
