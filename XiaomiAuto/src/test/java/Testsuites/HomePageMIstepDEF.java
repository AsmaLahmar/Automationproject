package Testsuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;

import Pages.HomePageMI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageMIstepDEF {
	
	@Given("Admin is on Xiaomi HomePage")
	public void admin_is_on_xiaomi_home_page() throws Exception {
	    Config.ConfChrome();
	    Config.driver = new ChromeDriver();
	    Config.maximizewindow();
	    Config.attente(10);
	    Config.driver.get(Utils.getproprety("WebsiteLink"));
	    
	}

	@When("Admin clicks on {string} and on a {string}")
	public void admin_clicks_on_and_on_a(String Menu, String Submenu) throws Exception {
		HomePageMI page = new HomePageMI ();
		page.MousehoverMenuAndclickSubmenu(Menu, Submenu);
	   
	}

	@Then("Admin is redirected to the page that contains the chosen submenu {string}")
	public void admin_is_redirected_to_the_page_that_contains_the_chosen_submenu(String ExpectedMessage) {
	   HomePageMI page = new HomePageMI();
	   String ActualMessage= page.verificationPage();
	   Assert.assertEquals(ExpectedMessage, ActualMessage);
	   Config.driver.quit();
	}
	
	
	
	}

