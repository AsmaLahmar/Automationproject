package Testsuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DellHomePagestepdef {
	@Given("Admin is on Dell Homepage")
	public void admin_is_on_dell_homepage() throws Exception  {
		Config.confchrome();
		Config.driver = new ChromeDriver();
	   Config.maximisewindow();
	   Config.attente(10);
	 Config.driver.get(Utils.getproprety("Web_portal_link"));
	}

	@When("Admin mousehovers on menu {string} and submenu {string}")
	public void admin_mousehovers_on_menu_and_submenu(String MenuName, String SubmenuName) throws Exception  {
		HomePage home = new HomePage ();
		home.selectProduct(MenuName, SubmenuName);
	  
	}

	@When("Admin clicks on product {string}")
	public void admin_clicks_on_product(String productName) {
		HomePage home = new HomePage();
		home.clickonProduct(productName);
	   
	}

	@Then("Admin is directed to the product page that contains the message {string}")
	public void admin_is_directed_to_the_product_page_that_contains_the_message(String ExpectedMessage) {
	   HomePage home = new HomePage();
	   String ActualMessage = home.verification();
	   Assert.assertEquals(ExpectedMessage, ActualMessage);
	}

}
