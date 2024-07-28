package Testsuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.HomePageXiaomi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageXiaomiTestsuite {

	
	
	@Given("Admin is on Xiaomi HomePage")
	public void admin_is_on_xiaomi_home_page() throws Exception {
		Config.ConfChrome();
	    Config.driver = new ChromeDriver();
	    Config.maximizewindow();
	    Config.attente(0);
	    Config.driver.get(Utils.getproprety("WebsiteLink"));

	}

	@When("Admin clicks on Menu {string} and on submenu  {string}")
	public void admin_clicks_on_menu_and_on_submenu(String Menu, String submenu) throws Exception {
	    HomePageXiaomi Home = new HomePageXiaomi();
	    Home.MousehoverMenuAndclickSubmenu(Menu, submenu);
	}

	@Then("Admin is redirected to the page that contains the chosen submenu {string}")
	public void admin_is_redirected_to_the_page_that_contains_the_chosen_submenu(String ExpectedText) {
	   HomePageXiaomi Home = new HomePageXiaomi();
	   String ActualText = Home.verifPage();
	   Assert.assertEquals(ExpectedText, ActualText);
	   Config.driver.quit();
	}
}
