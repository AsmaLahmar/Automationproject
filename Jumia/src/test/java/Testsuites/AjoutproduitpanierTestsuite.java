package Testsuites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.Ajoutproduitpanier;
import Pages.HomePage;

public class AjoutproduitpanierTestsuite {
 Ajoutproduitpanier Ajoutproduitp;
 
	@Before
	public void init () throws Exception { 
		Config.confChrome();
		Config.driver = new ChromeDriver();
		Config.maximizewindow();
		String url = "https://www.jumia.com.tn/mlp-informatique/ordinateurs-pc/";
		Config.driver.get(url);
		HomePage Home = new HomePage();
		Home.closefenetre();
		
		Ajoutproduitp= new Ajoutproduitpanier();
		
	}
	@Test
	public void Ajoutpcaupanier() throws Exception {
		Ajoutproduitp.selectionnerProduit("Lenovo PC Portable IP I5-12è 8GO 512G SSD 2G Iris Gris Garantie 2an + Sacoshe Original");
		
		
		
	}
	
}
