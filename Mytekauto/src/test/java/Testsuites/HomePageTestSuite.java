package Testsuites;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;

public class HomePageTestSuite {

	@Test
	public void ClickOnproduct() {
		Config.ConfigChrome();
		Config.driver = new ChromeDriver();
		Config.maximisewindow();
		String url = "https://www.mytek.tn/";
		Config.driver.get(url);
		
		HomePage page = new HomePage();
		page.Clickproduct("INFORMATIQUE", "Pc Portable");
		page.verif("Pc Portable");
		Config.driver.quit();
	}
}
