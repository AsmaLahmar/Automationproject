package Testsuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.AjoutproduitPanier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutproduitPanierStepDef {

	
	
	@Given("Admin is on page product")
	public void admin_is_on_page_product() throws Exception {
		Config.ConfChrome();
	    Config.driver = new ChromeDriver();
	    Config.maximizewindow();
	    String url = "https://mistore.com.tn/product/mi-temperature-and-humidity-monitor-pro/";
	    Config.driver.get(url);

	}

	@When("Admin adds product to the cart and clicks on cart")
	public void admin_adds_product_to_the_cart_and_clicks_on_cart() throws Exception {
		AjoutproduitPanier Ajout = new AjoutproduitPanier();
		  Ajout.AddproductToCart();
		  Ajout.Panier();

	}

	@Then("Admin is on the cart page and the product {string} has been added")
	public void admin_is_on_the_cart_page_and_the_product_has_been_added(String ExpectedMessage) throws Exception {
	   
		AjoutproduitPanier Ajout = new AjoutproduitPanier();
		 String ActualMessage= Ajout.verifproduitPanier();
		   Assert.assertEquals(ExpectedMessage, ActualMessage);
		   Config.driver.quit();
		
	}


}
