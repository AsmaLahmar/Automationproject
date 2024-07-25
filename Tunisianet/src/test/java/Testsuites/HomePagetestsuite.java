package Testsuites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;

public class HomePagetestsuite {
	HomePage Home ; 
	@Before 

	public void init() {
		Config.confChrome();
		Config.driver = new ChromeDriver ();
		Config.maximizewindow();
		String url = "https://www.tunisianet.com.tn/";
		Config.driver.get(url);
		Home = new HomePage();

}
	//@Test
public void mouseHover() {
	Home.mousehoverovermenu("Stockage", "Disque SSD");
}
@Test
public void productsearch( ) {
	Home.rechercheproduit("Samsung");
}

}
