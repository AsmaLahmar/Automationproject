package Testsuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.AjoutproduitPanier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutaupanierStepDef {
	
	
	
	@Given("Admin is on page product")
	public void admin_is_on_page_product() throws Exception {
		Config.ConfChrome();
	    Config.driver = new ChromeDriver();
	    Config.maximizewindow();
	    String url = "https://mistore.com.tn/product/humidificateur-xiaomi-2-lite/";
	    Config.driver.get(url);
	
	}
	
	
	@When("Admin adds product {string} to the cart")
	public void admin_adds_product_to_the_cart(String productName) throws Exception {
	  AjoutproduitPanier Ajout = new AjoutproduitPanier();
	  Ajout.AddproductToCart();
	}

	@Then("Admin clicks on the cart and verifies that the product {string} has been added")
	public void admin_clicks_on_the_cart_and_verifies_that_the_product_has_been_added(String productName) throws Exception {
	    
		AjoutproduitPanier Ajout = new AjoutproduitPanier();
		 String ActualMessage= Ajout.verifproduitPanier();
		   Assert.assertEquals(productName, ActualMessage);
		   Config.driver.quit();
		Config.driver.quit();
		
	}
}
