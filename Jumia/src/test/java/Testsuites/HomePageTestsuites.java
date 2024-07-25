package Testsuites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.Ajoutproduitpanier;
import Pages.HomePage;

public class HomePageTestsuites {
	HomePage Home;
	
@Before
public void init () throws Exception {
	Config.confChrome();
	Config.driver = new ChromeDriver();
	Config.maximizewindow();
	
	String url = "https://www.jumia.com.tn/" ;
	Config.driver.get(url);
	
	Home = new HomePage();
    Home.closefenetre();
    

}

//@Test
public void ClickonMenuByName() {
	Home.ClickOnMenuByName("Mode");
	Config.driver.quit();
	}
@Test
public void MouseHoverOverMenuAndclickSubmenu() throws Exception {
	Home.MouseHoverOverMenuAndclickSubmenu("Informatique", "Ordinateurs portables");
	Ajoutproduitpanier Ajoutproduitp = new Ajoutproduitpanier();
	Ajoutproduitp.selectionnerProduit("Lenovo PC Portable IP I5-12è 8GO 512G SSD 2G Iris Gris Garantie 2an + Sacoshe Original");
	Config.driver.quit();
}
	
//@Test
public void RechercherProduitByName() {
	Home.RechercherProduit("samsung");
	Config.driver.quit();
	
	
}
	
}

