package Testsuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.ProduitPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProduitPagestepDef {

	
	@Given("Admin is on product page")
	public void admin_is_on_product_page() throws Exception {
		Config.ConfChrome();
	    Config.driver = new ChromeDriver();
	    Config.maximizewindow();
	    String url = "https://mistore.com.tn/product-category/maison-connectee/";
	    Config.driver.get(url);
	    		
	}

	@When("Admin clicks on the chosen product {string}")
	public void admin_clicks_on_the_chosen_product(String ProductName) {
	    ProduitPage Page = new ProduitPage();
	    Page.ClickOnProduct(ProductName);
	}

	@Then("Admin is directed to the page of the product that contains the title {string}")
	public void admin_is_directed_to_the_page_of_the_product_that_contains_the_title(String ProductTitle) {
	    
		 ProduitPage Page = new ProduitPage();
		   String ActualMessage= Page.verifproduct();
		   Assert.assertEquals(ProductTitle, ActualMessage);
		   Config.driver.quit();
}
}
